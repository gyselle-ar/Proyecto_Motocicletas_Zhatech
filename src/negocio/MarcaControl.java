
package negocio;

import datos.MarcaDAO;
import entidades.Marca;
import java.util.List;


public class MarcaControl {
    
    private final MarcaDAO DATOS;

    public MarcaControl() {
        this.DATOS = new MarcaDAO();
    }
    
    public List<Marca> listarPorTipoMoto(int idTipoMoto){
        return DATOS.listarPorTipoMoto(idTipoMoto);
    }
    
}
