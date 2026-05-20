package entidades;

import java.time.LocalDate;
import java.util.List;

public class MotoTrabajo extends Motocicleta {
    
    private int capacidadCarga;
    private double consumoCombustible;
    private boolean testResistenciaActivado;

    public MotoTrabajo() {
    }

    public MotoTrabajo(int capacidadCarga, double consumoCombustible, boolean testResistenciaActivado, int idMotocicleta, Marca marca, TipoMoto tipoMoto, LocalDate fechaCreacion, List<Componente> componentes) {
        super(idMotocicleta, marca, tipoMoto, fechaCreacion, componentes);
        this.capacidadCarga = capacidadCarga;
        this.consumoCombustible = consumoCombustible;
        this.testResistenciaActivado = testResistenciaActivado;
    }

    public int getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(int capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    public double getConsumoCombustible() {
        return consumoCombustible;
    }

    public void setConsumoCombustible(double consumoCombustible) {
        this.consumoCombustible = consumoCombustible;
    }

    public boolean isTestResistenciaActivado() {
        return testResistenciaActivado;
    }

    public void setTestResistenciaActivado(boolean testResistenciaActivado) {
        this.testResistenciaActivado = testResistenciaActivado;
    }
    
    public void activarTestResistencia(){
        testResistenciaActivado = true;
    }

    public int calcularCapacidadCarga(){
        
        int puntos = 0;
        for(Componente c : componentes){
            // Ruedas
            if(c.getNombre().contains("Victory Octane")){
                puntos += 2;
            }
            if(c.getNombre().contains("TVS Apache RR 310")){
                puntos += 3;
            }
            if(c.getNombre().contains("Bajaj Dominar 400")){
                puntos += 4;
            }
            // Carenaje
            if(c.getNombre().contains("Victory Magnum")){
                puntos += 4;
            }
            if(c.getNombre().contains("TVS Apache RR")){
                puntos += 2;
            }
            if(c.getNombre().contains("Bajaj Pulsar RS200")){
                puntos += 3;
            }
        }
        if(puntos >= 7){
            return 180;
        }
        if(puntos >= 5){
            return 140;
        }
        return 100;
    }
    
    public double calcularConsumoCombustible(){
        for(Componente c : componentes){
            if(c.getNombre().contains("Victory Freedom 106")){
                return 22.0;
            }
            if(c.getNombre().contains("Bajaj DTS-i")){
                return 35.0;
            }
            if(c.getNombre().contains("TVS Apache RTR")){
                return 42.0;
            }
        }
        return 20.0;
    }
    
    public String testDeResistencia() {
        int carga = calcularCapacidadCarga();
        double consumo = calcularConsumoCombustible();
        
        if (carga >= 180 && consumo >= 35) {
            return "La motocicleta presenta una excelente resistencia para trabajo continuo y recorridos prolongados.";
        }
        if (carga >= 140) {
            return "La configuración mantiene un desempeño equilibrado entre carga y eficiencia.";
        }
        return "La motocicleta está orientada a trabajos moderados y trayectos urbanos.";
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
        
        // Componentes
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
                            + "\nCarenaje: " + carenaje 
                            + "\nRuedas: " + ruedas 
                            + "\nManillar: " + manillar; 
        
        if(rendimiento >= 9){
            descripcion +=
            "\n\nLa configuración de trabajo seleccionada ofrece una excelente capacidad de carga, resistencia mecánica y eficiencia en recorridos prolongados. Los componentes elegidos favorecen un desempeño sólido en jornadas continuas, proporcionando estabilidad y confiabilidad tanto en trayectos urbanos como en rutas de mayor exigencia.";
        
        }else if(rendimiento >= 6){
            descripcion +=
            "\n\nLa motocicleta mantiene un desempeño equilibrado entre capacidad de trabajo, consumo de combustible y maniobrabilidad. La combinación de componentes permite una conducción estable y eficiente para actividades diarias y recorridos de exigencia moderada.";

        }else{
            descripcion +=
            "\n\nLa configuración seleccionada prioriza economía y practicidad sobre capacidad de carga y resistencia extrema. Aunque la motocicleta conserva un funcionamiento funcional para recorridos urbanos, algunos componentes limitan su desempeño en trabajos continuos o trayectos de alta exigencia.";
        }
 
        // Carga
        descripcion +=
            "\n\nCapacidad de carga: " + calcularCapacidadCarga() + "kg";
        
        // Combustible
        descripcion +=
            "\nConsumo de combustible: " + calcularConsumoCombustible() + "km/gal";
        
        // Test Resistencia
        if (testResistenciaActivado) {
            descripcion +=
            "\n\nTest de resistencia: " + testResistenciaActivado;
            descripcion +=
            "\n" + testDeResistencia();
        }
        return new Reporte(0, idMotocicleta, descripcion);
    }

    @Override
    public String toString() {
        return "MotoTrabajo{" + "capacidadCarga=" + capacidadCarga 
                + ", consumoCombustible=" + consumoCombustible + '}';
    }
}
