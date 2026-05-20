
package datos;

import database.Conexion;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class DetalleConfiguracionDAO{

    private final Conexion CON;
    private PreparedStatement ps;
    private boolean resp;

    public DetalleConfiguracionDAO() {
        this.CON = Conexion.getInstancia();
    }
    
    public DetalleConfiguracionDAO(Conexion CON) {
        this.CON = CON;
    }

    public boolean guardarDetalleConfiguracion(int idMotocicleta, int idComponente) {
        try {
            ps = CON.conectar().prepareStatement("INSERT INTO detalle_configuracion (id_motocicleta, id_componente) values (?,?)");
            
            ps.setInt(1, idMotocicleta);
            ps.setInt(2, idComponente);
            
            if (ps.executeUpdate() > 0) {
                resp = true;
            }
            ps.close();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            
        } finally {
            ps = null;
            CON.desconectar();
        }
        return resp; 
    }
    
    public boolean eliminarPorMoto(int idMotocicleta) {

         boolean resp = false;
         
        try {
            ps = CON.conectar().prepareStatement("DELETE FROM detalle_configuracion WHERE id_motocicleta = ?");
            ps.setInt(1, idMotocicleta);
            
            if (ps.executeUpdate() > 0) {
                resp = true;
            }
            ps.close();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            
        } finally {
            ps = null;
            CON.desconectar();
        }
        return resp;
    }
    
    
}
