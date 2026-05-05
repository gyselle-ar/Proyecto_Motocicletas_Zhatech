package entidades;

import java.time.LocalDate;
import java.util.List;

public class MotoTrabajo extends Motocicleta {
    
    private int capacidadCarga;
    private float consumoCombustible;

    public MotoTrabajo() {
    }

    public MotoTrabajo(int capacidadCarga, float consumoCombustible, int idMotocicleta, int idMarca, int idTipoMoto, LocalDate fechaCreacion, List<Componente> componentes) {
        super(idMotocicleta, idMarca, idTipoMoto, fechaCreacion, componentes);
        this.capacidadCarga = capacidadCarga;
        this.consumoCombustible = consumoCombustible;
    }

    public int getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(int capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    public float getConsumoCombustible() {
        return consumoCombustible;
    }

    public void setConsumoCombustible(float consumoCombustible) {
        this.consumoCombustible = consumoCombustible;
    }

    public String testDeResistencia() {
        if (capacidadCarga > 0 && consumoCombustible > 0 ) {
            return "";
        }else{
            return "";
        }
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
            return new Reporte(0, idMotocicleta, "Descripción", "Resultado");
        }
        
        return new Reporte(0, idMotocicleta, "Descripción general", "Resultado general");
    }

    @Override
    public String toString() {
        return "MotoTrabajo{" + "capacidadCarga=" + capacidadCarga 
                + ", consumoCombustible=" + consumoCombustible + '}';
    }
}
