
package datos;

import database.Conexion;
import entidades.Marca;
import entidades.TipoMotoMarca;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class TipoMotoMarcaDAO{

    private final Conexion CON;
    private PreparedStatement ps;
    private ResultSet rs;
    private boolean resp;

    public TipoMotoMarcaDAO() {
        this.CON = Conexion.getInstancia();
    }
    
    public TipoMotoMarcaDAO(Conexion CON) {
        this.CON = CON;
    }
    
    public List<Marca> listarMarcasPorTipo(int idTipoMoto) {
        List<Marca> lista = new ArrayList();
        
        try {
            ps = CON.conectar().prepareStatement(
                    "SELECT m.id_marca, m.nombre " +
                    "FROM marca m " +
                    "INNER JOIN tipo_moto_marca tmm " +
                    "ON m.id_marca = tmm.id_marca " +
                    "WHERE tmm.id_tipo_moto = ?");
            
            ps.setInt(1, idTipoMoto);
            rs = ps.executeQuery();
            
            while(rs.next()){
                
                Marca marca = new Marca();
                
                marca.setIdMarca(rs.getInt(1));
                marca.setNombre(rs.getString(2));

                lista.add(marca);
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
