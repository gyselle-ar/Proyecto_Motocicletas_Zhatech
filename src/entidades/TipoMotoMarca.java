
package entidades;


public class TipoMotoMarca {
    
    private int idTipoMoto;
    private int idMarca;

    public TipoMotoMarca() {
    }

    public TipoMotoMarca(int idTipoMoto, int idMarca) {
        this.idTipoMoto = idTipoMoto;
        this.idMarca = idMarca;
    }

    public int getIdTipoMoto() {
        return idTipoMoto;
    }

    public void setIdTipoMoto(int idTipoMoto) {
        this.idTipoMoto = idTipoMoto;
    }

    public int getIdMarca() {
        return idMarca;
    }

    public void setIdMarca(int idMarca) {
        this.idMarca = idMarca;
    }

    @Override
    public String toString() {
        return "TipoMotoMarca{" + "idTipoMoto=" + idTipoMoto + ", idMarca=" + idMarca + '}';
    }
    
    
    
}
