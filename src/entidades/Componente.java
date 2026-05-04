
package entidades;

public class Componente {
    
    private int idComponente;
    private String nombre;
    private String categoria;

    public Componente() {
    }

    public Componente(int idComponente, String nombre, String categoria) {
        this.idComponente = idComponente;
        this.nombre = nombre;
        this.categoria = categoria;
    }

    public int getIdComponente() {
        return idComponente;
    }

    public void setIdComponente(int idComponente) {
        this.idComponente = idComponente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Componente{" + "idComponente=" + idComponente 
                + ", nombre=" + nombre + ", categoria=" + categoria + '}';
    }  
}
