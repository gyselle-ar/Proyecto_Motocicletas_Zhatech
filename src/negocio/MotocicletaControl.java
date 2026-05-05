
package negocio;

import datos.MotocicletaDAO;
import entidades.MotoCruiser;
import entidades.MotoDeportiva;
import entidades.MotoTrabajo;
import entidades.Motocicleta;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;


public class MotocicletaControl {
    
    private final MotocicletaDAO DATOS;
    private Motocicleta obj;
    private DefaultTableModel modeloTabla;
    public int motosCreadas;

    public MotocicletaControl(MotocicletaDAO DATOS, Motocicleta obj) {
        this.DATOS = new MotocicletaDAO();
        this.obj = null;
    }
    
    public DefaultTableModel listar(){
        List<Motocicleta> lista = new ArrayList<>();
        lista.addAll(DATOS.listar());
        
        String[] titulos = {"Id" , "Marca", "Tipo", "Fecha"};
        this.modeloTabla = new DefaultTableModel(null, titulos);
        
        
        String[] registro = new String[4];
        this.motosCreadas = 0;
        
        for(Motocicleta item: lista){
            
            registro[0] = String.valueOf(item.getIdMotocicleta());
            registro[1] = String.valueOf(item.getIdMarca());
            registro[2] = String.valueOf(item.getIdMotocicleta());
            registro[3] = item.getFechaCreacion().toString();
            
            this.modeloTabla.addRow(registro);
            this.motosCreadas = this.motosCreadas +1;
        }
        return this.modeloTabla;
    }
    
    public String guardar(int idMarca, int idTipoMoto, LocalDate fechaCreacion){
        switch (idTipoMoto) {
            case 1:
                obj = new MotoDeportiva();
                break;
            case 2:
                obj = new MotoTrabajo();
                break;
            default:
                obj = new MotoCruiser();
                break;
        }
        
        obj.setIdMarca(idMarca);
        obj.setIdTipoMoto(idTipoMoto);
        obj.setFechaCreacion(fechaCreacion);
        
        if (DATOS.guardar(obj)) {
                return "Moto creada con éxito.";
            }else{
                return "Error en la creación.";
            }
    }
    
    public String eliminar(int id){
        if (DATOS.eliminar(id)) {
            return "Moto eliminada con éxito.";
        }else{
            return "No se pudo eliminar la moto.";
        }
    }
    
    public Motocicleta buscarPorId(int id){
        return DATOS.buscarPorId(id);
    }
    
}
