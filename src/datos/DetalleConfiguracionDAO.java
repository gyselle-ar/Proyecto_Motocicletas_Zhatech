
package datos;

import database.Conexion;
import datos.interfaces.CrudSimpleInterface;
import entidades.DetalleConfiguracion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class DetalleConfiguracionDAO implements CrudSimpleInterface<DetalleConfiguracion>{

    private final Conexion CON;
    private PreparedStatement ps;
    private ResultSet rs;
    private boolean resp;

    public DetalleConfiguracionDAO() {
        this.CON = Conexion.getInstancia();
    }
    
    public DetalleConfiguracionDAO(Conexion CON) {
        this.CON = CON;
    }

    @Override
    public List<DetalleConfiguracion> listar() {
        List<DetalleConfiguracion> lista = new ArrayList();
        
        try {
            ps = CON.conectar().prepareStatement("SELECT * FROM detalle_configuracion");
            rs = ps.executeQuery();
            
            while(rs.next()){
                
                DetalleConfiguracion detalle = new DetalleConfiguracion();
                
                detalle.setIdDetalle(rs.getInt(1));
                detalle.setIdMotocicleta(rs.getInt(2));
                detalle.setIdComponente(rs.getInt(3));
               
                lista.add(detalle);
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

    @Override
    public boolean guardar(DetalleConfiguracion obj) {
        try {
            ps = CON.conectar().prepareStatement("INSERT INTO detalle_configuracion (id_motocicleta, id_componente) values (?,?)");
            
            ps.setInt(1, obj.getIdMotocicleta());
            ps.setInt(2, obj.getIdComponente());
            
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

    @Override
    public boolean eliminar(int id) {
        resp = false;
        
        try {
            ps = CON.conectar().prepareStatement("DELETE FROM detalle_configuracion WHERE id_detalle = ?");
            ps.setInt(1, id);
            
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

    @Override
    public DetalleConfiguracion buscarPorId(int id) {
        DetalleConfiguracion detalle = null;
        
        try {
            ps = CON.conectar().prepareStatement("SELECT FROM detalle_configuracion WHERE id_detalle = ?");
            ps.setInt(1, id);
            rs = ps.executeQuery();
            
            if (rs.next()) {
                detalle = new DetalleConfiguracion();
                
                detalle.setIdDetalle(rs.getInt(1));
                detalle.setIdMotocicleta(rs.getInt(2));
                detalle.setIdComponente(rs.getInt(3));
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
        return detalle;
    }  
}
