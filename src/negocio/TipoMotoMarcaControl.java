
package negocio;

import datos.TipoMotoMarcaDAO;
import entidades.Marca;
import entidades.TipoMotoMarca;
import java.util.List;
import javax.swing.table.DefaultTableModel;


public class TipoMotoMarcaControl {
    
    private final TipoMotoMarcaDAO DATOS;
    private TipoMotoMarca obj;
    private DefaultTableModel modeloTabla;

    public TipoMotoMarcaControl(TipoMotoMarcaDAO DATOS, TipoMotoMarca obj) {
        this.DATOS = DATOS;
        this.obj = obj;
    }
    
    public List<Marca> listarMarcasPorTipo(int idTipoMoto) {
        return DATOS.listarMarcasPorTipo(idTipoMoto);
    }
    
}
