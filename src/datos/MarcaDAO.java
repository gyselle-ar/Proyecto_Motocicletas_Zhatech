
package datos;

import database.Conexion;
import datos.interfaces.CrudSimpleInterface;
import entidades.Marca;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class MarcaDAO implements CrudSimpleInterface<Marca>{

    private final Conexion CON;
    private PreparedStatement ps;
    private ResultSet rs;
    private boolean resp;

    public MarcaDAO() {
        this.CON = Conexion.getInstancia();
    }
    
    public MarcaDAO(Conexion CON) {
        this.CON = CON;
    }
    
    @Override
    public List<Marca> listar() {
        List<Marca> listaMarcas = new ArrayList();
        
        try {
            ps = CON.conectar().prepareStatement("SELECT * FROM marca");
            rs = ps.executeQuery();
            
            while(rs.next()){
                
                Marca marca = new Marca();
                
                marca.setIdMarca(rs.getInt(1));
                marca.setNombre(rs.getString(2));

                listaMarcas.add(marca);
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
        return listaMarcas;
    }

    @Override
    public boolean guardar(Marca obj) {
        throw new UnsupportedOperationException("No es necesario."); 
    }

    @Override
    public boolean eliminar(int id) {
        throw new UnsupportedOperationException("No es necesario."); 
    }

    @Override
    public Marca buscarPorId(int id) {
        throw new UnsupportedOperationException("No es necesario."); 
    }
    
    public List<Marca> listarPorTipoMoto(int idTipoMoto) {
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
