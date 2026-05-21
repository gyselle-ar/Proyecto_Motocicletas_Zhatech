
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

    public ReporteControl() {
        this.DATOS = new ReporteDAO();
    }

    
    public String guardar(Reporte obj) {

        if (DATOS.guardar(obj)) {
            return "Reporte guardado correctamente.";
        }
        return "Error al guardar el reporte.";
    }
    
    public Reporte buscarPorIdMoto(int idMotocicleta) {
        return DATOS.buscarPorMoto(idMotocicleta);
    }
    
    public String eliminarPorMoto(int idMotocicleta) {

        if (DATOS.eliminar(idMotocicleta)) {
            return "Reporte eliminado con éxito.";
        } else {
            return "No se pudo eliminar el reporte.";
        }
    }
    
}
