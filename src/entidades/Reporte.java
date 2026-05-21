
package entidades;

public class Reporte {
    
    private int id;
    private int idMotocicleta;
    private String descripcion;
    private Motocicleta motocicleta;

    public Reporte() {
    }

    public Reporte(int id, int idMotocicleta, String descripcion) {
        this.id = id;
        this.idMotocicleta = idMotocicleta;
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdMotocicleta() {
        return idMotocicleta;
    }

    public void setIdMotocicleta(int idMotocicleta) {
        this.idMotocicleta = idMotocicleta;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Motocicleta getMotocicleta() {
        return motocicleta;
    }

    public void setMotocicleta(Motocicleta motocicleta) {
        this.motocicleta = motocicleta;
    }
    

    @Override
    public String toString() {
        return "Reporte: " + "id=" + id + ", idMotocicleta=" + idMotocicleta 
                + ", descripcion=" + descripcion;
    }   
}
