package entidades;

import java.time.LocalDate;
import java.util.List;

public class MotoDeportiva extends Motocicleta {
    
    private double aerodinamica;
    private boolean modoPista;
    private boolean turboActivado;

    public MotoDeportiva() {
    }

    public MotoDeportiva(double aerodinamica, boolean modoPista, boolean turboActivado, int idMotocicleta, int idMarca, int idTipoMoto, LocalDate fechaCreacion, List<Componente> componentes) {
        super(idMotocicleta, idMarca, idTipoMoto, fechaCreacion, componentes);
        this.aerodinamica = aerodinamica;
        this.modoPista = modoPista;
        this.turboActivado = turboActivado;
    }

    public double getAerodinamica() {
        return aerodinamica;
    }

    public void setAerodinamica(double aerodinamica) {
        this.aerodinamica = aerodinamica;
    }

    public boolean isModoPista() {
        return modoPista;
    }

    public void setModoPista(boolean modoPista) {
        this.modoPista = modoPista;
    }

    public boolean isTurboActivado() {
        return turboActivado;
    }

    public void setTurboActivado(boolean turboActivado) {
        this.turboActivado = turboActivado;
    }

    public void activarTurbo() {
        turboActivado = true;
    }
    
    @Override
    public Reporte generarReporte(){
        
        String motor = "";
        String carenaje = "";
        String ruedas = "";
        String manillar = "";
 
        for(Componente c: componentes){
            if (c.getCategoria().equalsIgnoreCase("Motor")) {
                motor = c.getNombre();
            }
            
            if (c.getCategoria().equalsIgnoreCase("Carenaje")) {
                carenaje = c.getNombre();
            }
            
            if (c.getCategoria().equalsIgnoreCase("Ruedas")) {
                ruedas = c.getNombre();
            }
            
            if (c.getCategoria().equalsIgnoreCase("Manillar")) {
                manillar = c.getNombre();
            }
        }
        
        if (motor.equalsIgnoreCase("") && ruedas.equalsIgnoreCase("")) {
            return new Reporte(0, idMotocicleta, "Descripción");
        }
        
        return new Reporte(0, idMotocicleta, "Descripción general");
    }

    @Override
    public String toString() {
        return "MotoDeportiva{" + "aerodinamica=" + aerodinamica 
                + ", modoPista=" + modoPista + '}';
    }
}
