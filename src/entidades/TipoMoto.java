
package entidades;


public class TipoMoto {
    
    private int idTipoMoto;
    private String nombre;

    public TipoMoto() {
    }

    public TipoMoto(int idTipoMoto, String nombre) {
        this.idTipoMoto = idTipoMoto;
        this.nombre = nombre;
    }

    public int getIdTipoMoto() {
        return idTipoMoto;
    }

    public void setIdTipoMoto(int idTipoMoto) {
        this.idTipoMoto = idTipoMoto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "TipoMoto{" + "idTipoMoto=" + idTipoMoto + ", nombre=" + nombre + '}';
    }
    
    
    
}
