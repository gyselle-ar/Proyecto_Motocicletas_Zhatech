
package entidades;


public class TipoMotoComponente {
    
    private int idTipoMoto;
    private int idComponente;

    public TipoMotoComponente() {
    }

    public TipoMotoComponente(int idTipoMoto, int idComponente) {
        this.idTipoMoto = idTipoMoto;
        this.idComponente = idComponente;
    }

    public int getIdTipoMoto() {
        return idTipoMoto;
    }

    public void setIdTipoMoto(int idTipoMoto) {
        this.idTipoMoto = idTipoMoto;
    }

    public int getIdComponente() {
        return idComponente;
    }

    public void setIdComponente(int idComponente) {
        this.idComponente = idComponente;
    }

    @Override
    public String toString() {
        return "TipoMotoComponente{" + "idTipoMoto=" + idTipoMoto 
                + ", idComponente=" + idComponente + '}';
    }
    
    
    
}
