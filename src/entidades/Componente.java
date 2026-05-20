
package entidades;

public class Componente {
    
    private int idComponente;
    private String nombre;
    private String categoria;
    private TipoMoto tipoMoto;
    private Marca marca;

    public Componente() {
    }

    public Componente(int idComponente, String nombre, String categoria, TipoMoto tipoMoto, Marca marca) {
        this.idComponente = idComponente;
        this.nombre = nombre;
        this.categoria = categoria;
        this.tipoMoto = tipoMoto;
        this.marca = marca;
    }

    public int getIdComponente() {
        return idComponente;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public TipoMoto getTipoMoto() {
        return tipoMoto;
    }

    public Marca getMarca() {
        return marca;
    }

    @Override
    public String toString() {
        return "Componente{" + "idComponente=" + idComponente 
                + ", nombre=" + nombre + ", categoria=" + categoria + '}';
    }  
}
