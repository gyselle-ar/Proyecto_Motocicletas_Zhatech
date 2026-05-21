package entidades;

import java.time.LocalDate;
import java.util.List;

public class MotoDeportiva extends Motocicleta {
    
    private double aerodinamica;
    private boolean modoPista;
    private boolean turboActivado;

    public MotoDeportiva() {
    }

    public MotoDeportiva(double aerodinamica, boolean modoPista, boolean turboActivado, int idMotocicleta, Marca marca, TipoMoto tipoMoto, LocalDate fechaCreacion, List<Componente> componentes) {
        super(idMotocicleta, marca, tipoMoto, fechaCreacion, componentes);
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
    
    public double calcularAerodinamica(){
        for(Componente c : componentes){
            if(c.getCategoria().equalsIgnoreCase("Carenaje")){
                if(c.getNombre().contains("Honda Fireblade")){
                    return 9.8;
                }
                if(c.getNombre().contains("Yamaha R6")){
                    return 8.7;
                }
                if(c.getNombre().contains("Kawasaki Ninja 400")){
                    return 7.5;
                }
            }
        
        }
        return 5.0;
    }

    public void activarModoPista(){
        modoPista = true;
    }
    
    public void activarTurbo() {
        turboActivado = true;
    }
    
    private int calcularPuntos(String nombre) {
        if (nombre.contains("Yamaha Crossplane") || nombre.contains("Kawasaki Ninja H2") || 
        nombre.contains("Kawasaki ZX-10R") || nombre.contains("Honda Fireblade")) {
            return 4;
        }

        if (nombre.contains("Honda VTEC") || nombre.contains("Yamaha YZF-R1") || 
        nombre.contains("Honda CBR600RR") || nombre.contains("Yamaha R6")) {
            return 3;
        }

        if (nombre.contains("Yamaha MT Series") || nombre.contains("Honda CB Hornet") || 
        nombre.contains("Kawasaki Z Series") || nombre.contains("Kawasaki Ninja 400")) {
            return 2;
        }

        return 1;
    }
    
    @Override
    public Reporte generarReporte(){
        
        //Componentes
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
            "\n\nLa configuración deportiva seleccionada ofrece un rendimiento "
                    + "altamente competitivo, destacándose por su aceleración, "
                    + "estabilidad y comportamiento aerodinámico a altas velocidades. "
                    + "Los componentes elegidos favorecen una conducción agresiva y precisa, "
                    + "ideal para escenarios de pista y conducción de alto desempeño.";
        
        }else if(rendimiento >= 6){
            descripcion +=
            "\n\nLa motocicleta mantiene un equilibrio adecuado entre velocidad, maniobrabilidad "
                    + "y estabilidad. La combinación de componentes permite una conducción "
                    + "deportiva estable tanto en recorridos urbanos como en trayectos de mayor exigencia, "
                    + "conservando un buen nivel de respuesta y control.";

        }else{
            descripcion +=
            "\n\nLa configuración seleccionada prioriza ciertos aspectos visuales y de "
                    + "personalización sobre el rendimiento extremo. Aunque la motocicleta "
                    + "conserva un comportamiento deportivo, algunos componentes limitan su "
                    + "estabilidad y eficiencia en condiciones de conducción de alta exigencia.";
        }
        
        // Aerodinámica 
        double aerodinamica = calcularAerodinamica();
        
        descripcion +=
            "\n\nAerodinámica: " + aerodinamica;
        
        if(aerodinamica >= 9){
            descripcion +=
            "\nLa configuración favorece una conducción altamente eficiente en velocidad y estabilidad aerodinámica.";
        
        }else if(aerodinamica >= 8){
            descripcion +=
            "\nLa motocicleta mantiene un excelente equilibrio aerodinámico en escenarios deportivos.";

        }else{
            descripcion +=
            "\nLa configuración proporciona un desempeño estable para escenarios deportivos moderados.";
        }
        
        //Turbo
        descripcion +=
                "\n\nTurbo activado: " + turboActivado;
        
        if (turboActivado) {
            descripcion +=
            "\nLa activación del turbo permite una respuesta más explosiva y una aceleración superior en altas revoluciones.";
        }else{
            descripcion +=
            "\nLa motocicleta mantiene una entrega de potencia equilibrada y controlada.";
        }
        
        // Modo Pista
        descripcion +=
                "\n\nModo pista: " + modoPista;
        
        if (modoPista) {
            descripcion +=
            "\nEl modo pista optimiza el comportamiento de la motocicleta para obtener un rendimiento más competitivo y agresivo.";
        }else{
            descripcion +=
            "\nLa configuración prioriza una conducción equilibrada y estable para distintos entornos.";
        }
 
        Reporte reporte = new Reporte();
        reporte.setDescripcion(descripcion);
        reporte.setMotocicleta(this);
        
        return reporte;
    }

    @Override
    public String toString() {
        return "MotoDeportiva{" + "aerodinamica=" + aerodinamica 
                + ", modoPista=" + modoPista + '}';
    }
}
