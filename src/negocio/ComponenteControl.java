
package negocio;

import datos.ComponenteDAO;
import entidades.Componente;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;


public class ComponenteControl {
    
    private final ComponenteDAO DATOS;
    private Componente obj;
    private DefaultTableModel modeloTabla;

    public ComponenteControl(ComponenteDAO DATOS, Componente obj) {
        this.DATOS = DATOS;
        this.obj = obj;
    }
    
    public DefaultTableModel listar() {

        List<Componente> lista = new ArrayList<>();
        lista.addAll(DATOS.listar());

        String[] titulos = {"Id", "Nombre", "Categoría"};
        this.modeloTabla = new DefaultTableModel(null, titulos);

        String[] registro = new String[3];

        for (Componente item : lista) {

            registro[0] = String.valueOf(item.getIdComponente());
            registro[1] = item.getNombre();
            registro[2] = item.getCategoria();

            this.modeloTabla.addRow(registro);
        }

        return this.modeloTabla;
    }
    
    public String guardar(String nombre, String categoria) {

        obj = new Componente();
        obj.setNombre(nombre);
        obj.setCategoria(categoria);

        if (DATOS.guardar(obj)) {
            return "Componente guardado con éxito.";
        } else {
            return "Error al guardar componente.";
        }
    }
    
    public String eliminar(int id) {

        if (DATOS.eliminar(id)) {
            return "Componente eliminado con éxito.";
        } else {
            return "No se pudo eliminar el componente.";
        }
    }
    
    public Componente buscarPorId(int id) {
        return DATOS.buscarPorId(id);
    }
}
