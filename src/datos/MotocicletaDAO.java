
package datos;

import database.Conexion;
import datos.interfaces.CrudSimpleInterface;
import entidades.Marca;
import entidades.MotoCruiser;
import entidades.MotoDeportiva;
import entidades.MotoTrabajo;
import entidades.Motocicleta;
import entidades.TipoMoto;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class MotocicletaDAO implements CrudSimpleInterface<Motocicleta>{

    private final Conexion CON;
    private PreparedStatement ps;
    private ResultSet rs;
    private boolean resp;

    public MotocicletaDAO() {
        this.CON = Conexion.getInstancia();
    }

    public MotocicletaDAO(Conexion CON) {
        this.CON = CON;
    }
    
    @Override
    public List<Motocicleta> listar() {
        
        List<Motocicleta> listaMotos = new ArrayList();
        
        try {
            ps = CON.conectar().prepareStatement("SELECT * FROM motocicleta");
            rs = ps.executeQuery();
            
            while(rs.next()){
                int tipoMoto = rs.getInt(3);
                Motocicleta moto;
                
                switch (tipoMoto) {
                    case 1:
                        moto = new MotoDeportiva();
                        break;
                    case 2:
                        moto = new MotoTrabajo();
                        break;
                    default:
                        moto = new MotoCruiser();
                        break;
                }
                
                moto.setIdMotocicleta(rs.getInt(1));
                Marca marca = new Marca();
                marca.setIdMarca(rs.getInt(2));
                moto.setMarca(marca);
                TipoMoto tipo = new TipoMoto();
                tipo.setIdTipoMoto(rs.getInt(3));
                moto.setTipoMoto(tipo);
                moto.setFechaCreacion(rs.getDate(4).toLocalDate());
                
                listaMotos.add(moto);
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
        return listaMotos;
    }

    @Override
    public boolean guardar(Motocicleta obj) {
        
        try {
            ps = CON.conectar().prepareStatement("INSERT INTO motocicleta (id_marca, id_tipo_moto, fecha_creacion) values (?,?,?)");
            
            ps.setInt(1, obj.getMarca().getIdMarca());
            ps.setInt(2, obj.getTipoMoto().getIdTipoMoto());
            ps.setDate(3, java.sql.Date.valueOf(obj.getFechaCreacion()));
            
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
    public boolean eliminar(int idMotocicleta) {
        
        resp = false;
        
        try {
            ps = CON.conectar().prepareStatement("DELETE FROM motocicleta WHERE id_motocicleta = ?");
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

    @Override
    public Motocicleta buscarPorId(int idMotocicleta) {
        
        Motocicleta moto = null;
        
        try {
            ps = CON.conectar().prepareStatement("SELECT FROM motocicleta WHERE id_motocicleta = ?");
            ps.setInt(1, idMotocicleta);
            rs = ps.executeQuery();
            
                if (rs.next()) {
                    int tipoMoto = rs.getInt(3);
                    
                    switch (tipoMoto) {
                    case 1:
                        moto = new MotoDeportiva();
                        break;
                    case 2:
                        moto = new MotoTrabajo();
                        break;
                    default:
                        moto = new MotoCruiser();
                        break;
                    }
                
                    moto.setIdMotocicleta(rs.getInt(1));
                    Marca marca = new Marca();
                    marca.setIdMarca(rs.getInt(2));
                    moto.setMarca(marca);
                    TipoMoto tipo = new TipoMoto();
                    tipo.setIdTipoMoto(rs.getInt(3));
                    moto.setTipoMoto(tipo);
                    moto.setFechaCreacion(rs.getDate(4).toLocalDate());
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
        return moto;
    }
}
