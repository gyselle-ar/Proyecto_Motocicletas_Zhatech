package entidades;

import java.time.LocalDate;
import java.util.List;

public abstract class Motocicleta implements Testeable {
    
    protected int idMotocicleta;
    protected String marca;
    protected String tipoMoto;
    protected LocalDate fechaCreacion;
    protected List<Componente> componentes;
            
    public Motocicleta() {
    }

    public Motocicleta(int idMotocicleta, String marca, String tipoMoto, LocalDate fechaCreacion, List<Componente> componentes) {
        this.idMotocicleta = idMotocicleta;
        this.marca = marca;
        this.tipoMoto = tipoMoto;
        this.fechaCreacion = fechaCreacion;
        this.componentes = componentes;
    }

    public int getIdMotocicleta() {
        return idMotocicleta;
    }

    public void setIdMotocicleta(int idMotocicleta) {
        this.idMotocicleta = idMotocicleta;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipoMoto() {
        return tipoMoto;
    }

    public void setTipoMoto(String tipoMoto) {
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

    @Override
    public boolean encenderSistema() {
        return true;
    }

    @Override
    public Reporte generarReporte() {
        return new Reporte(0, idMotocicleta, "", "");
    }

    @Override
    public String toString() {
        return "Motocicleta{" + "idMotocicleta=" + idMotocicleta 
                + ", marca=" + marca + ", tipoMoto=" + tipoMoto 
                + ", fechaCreacion=" + fechaCreacion 
                + ", componentes=" + componentes + '}';
    } 
}