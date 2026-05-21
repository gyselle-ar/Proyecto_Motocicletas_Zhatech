
package datos;

import database.Conexion;
import datos.interfaces.CrudSimpleInterface;
import entidades.Reporte;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class ReporteDAO implements CrudSimpleInterface<Reporte>{

    private final Conexion CON;
    private PreparedStatement ps;
    private ResultSet rs;
    private boolean resp;

    public ReporteDAO() {
        this.CON = Conexion.getInstancia();
    }
    
    public ReporteDAO(Conexion CON) {
        this.CON = CON;
    }

    @Override
    public List<Reporte> listar() {
        List<Reporte> listaReportes = new ArrayList();
        
        try {
            ps = CON.conectar().prepareStatement("SELECT * FROM reporte");
            rs = ps.executeQuery();
            
            while(rs.next()){
                
                Reporte reporte = new Reporte();
                
                reporte.setId(rs.getInt(1));
                reporte.setIdMotocicleta(rs.getInt(2));
                reporte.setDescripcion(rs.getString(3));
               
                listaReportes.add(reporte);
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
        return listaReportes;
    }

    @Override
    public boolean guardar(Reporte obj) {
       try {
            ps = CON.conectar().prepareStatement("INSERT INTO reporte (id_motocicleta, descripcion) values (?,?)");
            
            ps.setInt(1, obj.getIdMotocicleta());
            ps.setString(2, obj.getDescripcion());
            
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
            ps = CON.conectar().prepareStatement("DELETE FROM reporte WHERE id_reporte = ?");
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
    public Reporte buscarPorId(int id) {
        Reporte reporte = null;
        
        try {
            ps = CON.conectar().prepareStatement("SELECT FROM reporte WHERE id_reporte = ?");
            ps.setInt(1, id);
            rs = ps.executeQuery();
            
            if (rs.next()) {
                reporte = new Reporte();
                
                reporte.setId(rs.getInt(1));
                reporte.setIdMotocicleta(rs.getInt(2));
                reporte.setDescripcion(rs.getString(3));
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
        return reporte;
    }
    
    public Reporte buscarPorMoto(int idMotocicleta) {
        Reporte reporte = null;
        
        try {
            ps = CON.conectar().prepareStatement("SELECT FROM reporte WHERE id_motocicleta = ?");
            ps.setInt(1, idMotocicleta);
            rs = ps.executeQuery();
            
            if (rs.next()) {
                reporte = new Reporte();
                
                reporte.setId(rs.getInt(1));
                reporte.setIdMotocicleta(rs.getInt(2));
                reporte.setDescripcion(rs.getString(3));
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
        return reporte;
    }
    
    public boolean eliminarPorMoto(int idMotocicleta) {

         boolean resp = false;
         
        try {
            ps = CON.conectar().prepareStatement("DELETE FROM reporte WHERE id_motocicleta = ?");
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
