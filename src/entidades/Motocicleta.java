package entidades;

import java.time.LocalDate;
import java.util.List;

public abstract class Motocicleta implements Testeable {
    
    protected int idMotocicleta;
    protected int idMarca;
    protected int idTipoMoto;
    protected LocalDate fechaCreacion;
    protected List<Componente> componentes;
            
    public Motocicleta() {
    }

    public Motocicleta(int idMotocicleta, int idMarca, int idTipoMoto, LocalDate fechaCreacion, List<Componente> componentes) {
        this.idMotocicleta = idMotocicleta;
        this.idMarca = idMarca;
        this.idTipoMoto = idTipoMoto;
        this.fechaCreacion = fechaCreacion;
        this.componentes = componentes;
    }

    public int getIdMotocicleta() {
        return idMotocicleta;
    }

    public void setIdMotocicleta(int idMotocicleta) {
        this.idMotocicleta = idMotocicleta;
    }

    public int getIdMarca() {
        return idMarca;
    }

    public void setIdMarca(int idMarca) {
        this.idMarca = idMarca;
    }

    public int getIdTipoMoto() {
        return idTipoMoto;
    }

    public void setIdTipoMoto(int idTipoMoto) {
        this.idTipoMoto = idTipoMoto;
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
        return new Reporte(0, idMotocicleta, "");
    }

    @Override
    public String toString() {
        return "Motocicleta{" + "idMotocicleta=" + idMotocicleta 
                + ", marca=" + idMarca + ", tipoMoto=" + idTipoMoto 
                + ", fechaCreacion=" + fechaCreacion 
                + ", componentes=" + componentes + '}';
    } 
}