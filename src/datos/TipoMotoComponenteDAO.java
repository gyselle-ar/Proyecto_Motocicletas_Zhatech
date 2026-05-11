
package datos;

import database.Conexion;
import entidades.Componente;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class TipoMotoComponenteDAO {
    
  private final Conexion CON;
    private PreparedStatement ps;
    private ResultSet rs;
    private boolean resp;

    public TipoMotoComponenteDAO() {
        this.CON = Conexion.getInstancia();
    }
    
    public TipoMotoComponenteDAO(Conexion CON) {
        this.CON = CON;
    }
    
    public List<Componente> listarComponentesPorTipo(int idTipoMoto) {
        List<Componente> lista = new ArrayList();
        
        try {
            ps = CON.conectar().prepareStatement(
                    "SELECT c.id_componente, c.categoria, c.nombre " +
                    "FROM componente c " +
                    "INNER JOIN tipo_moto_componente tmc " +
                    "ON c.id_componente = tmc.id_componente " +
                    "WHERE tmc.id_tipo_moto = ?");
            
            ps.setInt(1, idTipoMoto);
            rs = ps.executeQuery();
            
            while(rs.next()){
                
                Componente componente = new Componente();
                
                componente.setIdComponente(rs.getInt(1));
                componente.setCategoria(rs.getString(2));
                componente.setNombre(rs.getString(3));

                lista.add(componente);
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
        return lista;
    }
}
