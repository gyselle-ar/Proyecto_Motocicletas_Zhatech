
package datos;

import database.Conexion;
import datos.interfaces.CrudSimpleInterface;
import entidades.TipoMoto;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class TipoMotoDAO implements CrudSimpleInterface<TipoMoto>{
    
    private final Conexion CON;
    private PreparedStatement ps;
    private ResultSet rs;
    private boolean resp;

    public TipoMotoDAO() {
        this.CON = Conexion.getInstancia();
    }
    
    public TipoMotoDAO(Conexion CON) {
        this.CON = CON;
    }

    @Override
    public List<TipoMoto> listar() {
        List<TipoMoto> listaTipoMotos = new ArrayList();
        
        try {
            ps = CON.conectar().prepareStatement("SELECT * FROM tipo_moto");
            rs = ps.executeQuery();
            
            while(rs.next()){
                
                TipoMoto tipo = new TipoMoto();
                
                tipo.setIdTipoMoto(rs.getInt(1));
                tipo.setNombre(rs.getString(2));

                listaTipoMotos.add(tipo);
            }
            ps.close();
            rs.close();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            
        } finally{
            ps = null;
            rs = null;
            CON.desconectar();
        }
        return listaTipoMotos;
    }

    @Override
    public boolean guardar(TipoMoto obj) {
        throw new UnsupportedOperationException("No es necesario."); 
    }

    @Override
    public boolean eliminar(int id) {
        throw new UnsupportedOperationException("No es necesario."); 
    }

    @Override
    public TipoMoto buscarPorId(int id) {
        throw new UnsupportedOperationException("No es necesario."); 
    }
    
}
