
package negocio;

import datos.TipoMotoComponenteDAO;
import entidades.Componente;
import entidades.TipoMotoComponente;
import java.util.List;
import javax.swing.table.DefaultTableModel;


public class TipoMotoComponenteControl {
    
    private final TipoMotoComponenteDAO DATOS;
    private TipoMotoComponente obj;
    private DefaultTableModel modeloTabla;

    public TipoMotoComponenteControl(TipoMotoComponenteDAO DATOS, TipoMotoComponente obj) {
        this.DATOS = DATOS;
        this.obj = obj;
    }
    
    public List<Componente> listarMarcasPorTipo(int idTipoMoto) {
        return DATOS.listarComponentesPorTipo(idTipoMoto);
    }
    
    
}
