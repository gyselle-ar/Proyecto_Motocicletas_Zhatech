
package negocio;

import datos.ReporteDAO;
import entidades.Motocicleta;
import entidades.Reporte;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;


public class ReporteControl {
    
    private final ReporteDAO DATOS;
    private DefaultTableModel modeloTabla;

    public ReporteControl(ReporteDAO DATOS) {
        this.DATOS = DATOS;
    }

    public String generarReporte(Motocicleta moto) {

        Reporte reporte = moto.generarReporte();

        if (DATOS.guardar(reporte)) {
            return "Reporte generado con éxito.";
        } else {
            return "Error al generar el reporte.";
        }
    }
    
    public DefaultTableModel listar() {

        List<Reporte> lista = new ArrayList<>();
        lista.addAll(DATOS.listar());

        String[] titulos = {"Id", "IdMoto", "Descripción"};
        this.modeloTabla = new DefaultTableModel(null, titulos);

        String[] registro = new String[3];

        for (Reporte item : lista) {

            registro[0] = String.valueOf(item.getId());
            registro[1] = String.valueOf(item.getIdMotocicleta());
            registro[2] = item.getDescripcion();

            this.modeloTabla.addRow(registro);
        }

        return this.modeloTabla;
    }
    
    public Reporte buscarPorId(int id) {
        return DATOS.buscarPorId(id);
    }
    
    public String eliminar(int id) {

        if (DATOS.eliminar(id)) {
            return "Reporte eliminado con éxito.";
        } else {
            return "No se pudo eliminar el reporte.";
        }
    }
    
}
