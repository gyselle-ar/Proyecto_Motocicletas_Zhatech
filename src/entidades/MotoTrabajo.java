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
    
    private int calcularPuntos(String nombre) {
        if (nombre.contains("Bajaj DTS-i") || nombre.contains("TVS Apache RR 310") || 
        nombre.contains("Bajaj Dominar 400") || nombre.contains("Bajaj Pulsar RS200")) {
            return 4;
        }

        if (nombre.contains("Victory Freedom 106") || nombre.contains("TVS Apache RTR") || 
        nombre.contains("Victory Octane") || nombre.contains("TVS Apache RR")) {
            return 3;
        }

        if (nombre.contains("Victory High Ball") || nombre.contains("TVS Raider") || 
        nombre.contains("Bajaj Pulsar") || nombre.contains("Victory Magnum")) {
            return 2;
        }

        return 1;
    }
    
    @Override
    public Reporte generarReporte(){
        
        String motor = "";
        String carenaje = "";
        String ruedas = "";
        String manillar = "";
        
        int rendimiento = 0;
 
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
            
            rendimiento += calcularPuntos(c.getNombre());
        }
      
        String descripcion = "Motor: " + motor 
                            + "Carenaje: " + carenaje 
                            + "Ruedas: " + ruedas 
                            + "Manillar: " + manillar; 
        
        if(rendimiento >= 9){
            descripcion +=
            "La configuración seleccionada ofrece un excelente rendimiento y estabilidad.";
        
        }else if(rendimiento >= 6){
            descripcion +=
            "La motocicleta mantiene un desempeño equilibrado para distintos escenarios.";

        }else{
            descripcion +=
            "Aunque la configuración es funcional, algunos componentes limitan el rendimiento general.";
        }
 
        return new Reporte(0, idMotocicleta, descripcion);
    }

    @Override
    public String toString() {
        return "MotoTrabajo{" + "capacidadCarga=" + capacidadCarga 
                + ", consumoCombustible=" + consumoCombustible + '}';
    }
}
