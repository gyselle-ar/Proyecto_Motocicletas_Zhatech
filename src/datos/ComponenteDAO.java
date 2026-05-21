
package datos;

import database.Conexion;
import datos.interfaces.CrudSimpleInterface;
import entidades.Componente;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class ComponenteDAO implements CrudSimpleInterface<Componente>{

    private final Conexion CON;
    private PreparedStatement ps;
    private ResultSet rs;
    private boolean resp;

    public ComponenteDAO() {
        this.CON = Conexion.getInstancia();
    }
    
    public ComponenteDAO(Conexion CON) {
        this.CON = CON;
    }

    @Override
    public List<Componente> listar() {
        throw new UnsupportedOperationException("No es necesario."); 
    }

    @Override
    public boolean guardar(Componente obj) {
        throw new UnsupportedOperationException("No es necesario."); 
    }

    @Override
    public boolean eliminar(int id) {
        throw new UnsupportedOperationException("No es necesario."); 
    }

    @Override
    public Componente buscarPorId(int id) {
        throw new UnsupportedOperationException("No es necesario."); 
    } 
    
    public List<Componente> listarPorTipoMoto(int idTipoMoto) {
        List<Componente> listaComponentes = new ArrayList();
        
        try {
            ps = CON.conectar().prepareStatement(
                    "SELECT c.id_componente, c.categoria, c.nombre " +
                    "FROM componente c " +
                    "INNER JOIN tipo_moto_componente tmc " +
                    "ON c.id_componente = tmc.id_componente " +
                    "WHERE tmc.id_tipo_moto = ?");
            
            rs = ps.executeQuery();
            
            while(rs.next()){
                
                Componente componente = new Componente();
                
                componente.setIdComponente(rs.getInt(1));
                componente.setCategoria(rs.getString(2));
                componente.setNombre(rs.getString(3));
               
                listaComponentes.add(componente);
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
        return listaComponentes;
    }
      
}
