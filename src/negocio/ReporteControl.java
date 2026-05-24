package negocio;

import datos.MotocicletaDAO;
import datos.ReporteDAO;
import entidades.Motocicleta;
import entidades.Reporte;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class ReporteControl {

    private final ReporteDAO DATOS;
    private DefaultTableModel modeloTabla;
    private MotocicletaDAO DATOSMOTO;

    public ReporteControl() {
        this.DATOS = new ReporteDAO();
        DATOSMOTO = new MotocicletaDAO();
    }

    public String guardar(Reporte obj) {

        if (DATOS.guardar(obj)) {
            return "Reporte guardado correctamente.";
        }
        return "Error al guardar el reporte.";
    }

    public Reporte buscarReporteConIdMoto(int idMoto) {
        List<Motocicleta> lista = DATOSMOTO.listar();

        for (Motocicleta moto : lista) {
            if (moto.getIdMotocicleta() == idMoto) {
                return moto.generarReporte();
            }
        }

        return null;
    }

    public String eliminarPorMoto(int idMotocicleta) {

        if (DATOS.eliminar(idMotocicleta)) {
            return "Reporte eliminado con éxito.";
        } else {
            return "No se pudo eliminar el reporte.";
        }
    }

    public String verReporte(int idMoto) {

        Reporte reporte = DATOS.buscarPorMoto(idMoto);
        if (reporte != null) {
            return reporte.getDescripcion();
        }
        return "No existe reporte para esta motocicleta";
    }

}
