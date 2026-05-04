
package entidades;

public class Reporte {
    
    private int id;
    private int idMotocicleta;
    private String descripcion;
    private String resultado;

    public Reporte() {
    }

    public Reporte(int id, int idMotocicleta, String descripcion, String resultado) {
        this.id = id;
        this.idMotocicleta = idMotocicleta;
        this.descripcion = descripcion;
        this.resultado = resultado;
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

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    @Override
    public String toString() {
        return "Reporte: " + "id=" + id + ", idMotocicleta=" + idMotocicleta 
                + ", descripcion=" + descripcion + ", resultado=" + resultado;
    }   
}
