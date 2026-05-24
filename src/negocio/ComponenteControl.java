
package negocio;

import datos.ComponenteDAO;
import entidades.Componente;
import java.util.List;


public class ComponenteControl {
    
    private final ComponenteDAO DATOS;
    
    public ComponenteControl() {
        this.DATOS = new ComponenteDAO();
    }
    
    public List<Componente> listarPorTipoMoto(int idTipoMoto){
        return DATOS.listarPorTipoMoto(idTipoMoto);
    }
}
