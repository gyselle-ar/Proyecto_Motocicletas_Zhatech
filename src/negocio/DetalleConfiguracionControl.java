
package negocio;

import datos.DetalleConfiguracionDAO;
import entidades.DetalleConfiguracion;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;


public class DetalleConfiguracionControl {
    
    private final DetalleConfiguracionDAO DATOS;
    private DetalleConfiguracion obj;
    private DefaultTableModel modeloTabla;

    public DetalleConfiguracionControl(DetalleConfiguracionDAO DATOS, DetalleConfiguracion obj) {
        this.DATOS = DATOS;
        this.obj = obj;
    }
    
    public DefaultTableModel listar() {

        List<DetalleConfiguracion> lista = new ArrayList<>();
        lista.addAll(DATOS.listar());

        String[] titulos = {"IdDetalle", "IdMoto", "IdComponente"};
        this.modeloTabla = new DefaultTableModel(null, titulos);

        String[] registro = new String[3];

        for (DetalleConfiguracion item : lista) {

            registro[0] = String.valueOf(item.getIdDetalle());
            registro[1] = String.valueOf(item.getIdMotocicleta());
            registro[2] = String.valueOf(item.getIdComponente());
        
            this.modeloTabla.addRow(registro);
        }
        return this.modeloTabla;
    }
    
    public String guardarConfiguracion(int idMoto, List<Integer> componentes) {

        boolean guardado = true;

        for (int idComponente : componentes) {

            obj = new DetalleConfiguracion();
            obj.setIdMotocicleta(idMoto);
            obj.setIdComponente(idComponente);

            if (!DATOS.guardar(obj)) {
                guardado = false;
            }
        }

        if (guardado) {
            return "Configuración completa guardada con éxito.";
        } else {
            return "Error en la configuración.";
        }
    }
      
    public String eliminar(int id) {

        if (DATOS.eliminar(id)) {
            return "Configuración eliminada con éxito.";
        } else {
            return "No se pudo eliminar la configuración.";
        }
    }
    
    public DetalleConfiguracion buscarPorId(int id) {
        return DATOS.buscarPorId(id);
    }   
}
