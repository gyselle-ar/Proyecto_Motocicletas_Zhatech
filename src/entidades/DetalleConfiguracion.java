
package entidades;


public class DetalleConfiguracion {
    
    private int idDetalle;
    private int idMotocicleta;
    private int idComponente;

    public DetalleConfiguracion() {
    }

    public DetalleConfiguracion(int idDetalle, int idMotocicleta, int idComponente) {
        this.idDetalle = idDetalle;
        this.idMotocicleta = idMotocicleta;
        this.idComponente = idComponente;
    }

    public int getIdDetalle() {
        return idDetalle;
    }

    public void setIdDetalle(int idDetalle) {
        this.idDetalle = idDetalle;
    }

    public int getIdMotocicleta() {
        return idMotocicleta;
    }

    public void setIdMotocicleta(int idMotocicleta) {
        this.idMotocicleta = idMotocicleta;
    }

    public int getIdComponente() {
        return idComponente;
    }

    public void setIdComponente(int idComponente) {
        this.idComponente = idComponente;
    }

    @Override
    public String toString() {
        return "DetalleConfiguracion{" + "idDetalle=" + idDetalle 
                + ", idMotocicleta=" + idMotocicleta 
                + ", idComponente=" + idComponente + '}';
    }
    
    
    
    
    
}
