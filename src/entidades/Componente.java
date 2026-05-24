
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

    public TipoMoto getTipoMoto() {
        return tipoMoto;
    }

    public void setTipoMoto(TipoMoto tipoMoto) {
        this.tipoMoto = tipoMoto;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return nombre;
    }  
}
