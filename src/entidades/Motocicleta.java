package entidades;

import datos.interfaces.Testeable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class Motocicleta implements Testeable {
    
    protected int idMotocicleta;
    protected Marca marca;
    protected TipoMoto tipoMoto;
    protected LocalDate fechaCreacion;
    protected List<Componente> componentes;
            
    public Motocicleta() {
    }

    public Motocicleta(int idMotocicleta, Marca marca, TipoMoto tipoMoto, LocalDate fechaCreacion, List<Componente> componentes) {
        this.idMotocicleta = idMotocicleta;
        this.marca = marca;
        this.tipoMoto = tipoMoto;
        this.fechaCreacion = fechaCreacion;
        this.componentes = new ArrayList<>();
    }

    public int getIdMotocicleta() {
        return idMotocicleta;
    }

    public void setIdMotocicleta(int idMotocicleta) {
        this.idMotocicleta = idMotocicleta;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public TipoMoto getTipoMoto() {
        return tipoMoto;
    }

    public void setTipoMoto(TipoMoto tipoMoto) {
        this.tipoMoto = tipoMoto;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public List<Componente> getComponentes() {
        return componentes;
    }

    public void setComponentes(List<Componente> componentes) {
        this.componentes = componentes;
    }

    public void agregarComponente(Componente c){
        componentes.add(c);
    }

    public abstract Reporte generarReporte();
 
    @Override
    public boolean encenderSistema() {
        return true;
    }

    @Override
    public String toString() {
        return "Motocicleta{" + "idMotocicleta=" + idMotocicleta 
                + ", marca=" + marca + ", tipoMoto=" + tipoMoto + ", fechaCreacion=" 
                + fechaCreacion + ", componentes=" + componentes + '}';
    }
}