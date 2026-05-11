
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
        List<Componente> listaComponentes = new ArrayList();
        
        try {
            ps = CON.conectar().prepareStatement("SELECT * FROM componente");
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

    @Override
    public boolean guardar(Componente obj) {
        try {
            ps = CON.conectar().prepareStatement("INSERT INTO componente (categoria, nombre) values (?,?)");
            
            ps.setString(1, obj.getCategoria());
            ps.setString(2, obj.getNombre());
            
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
            ps = CON.conectar().prepareStatement("DELETE FROM componente WHERE id_componente = ?");
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
    public Componente buscarPorId(int id) {
        
        Componente componente = null;
        
        try {
            ps = CON.conectar().prepareStatement("SELECT FROM componente WHERE id_componente = ?");
            ps.setInt(1, id);
            rs = ps.executeQuery();
            
            if (rs.next()) {
                componente = new Componente();
                
                componente.setIdComponente(rs.getInt(1));
                componente.setCategoria(rs.getString(2));
                componente.setNombre(rs.getString(3));
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
        return componente;
    }
    
}
