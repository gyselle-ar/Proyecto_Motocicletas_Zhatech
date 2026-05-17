package entidades;

import java.time.LocalDate;
import java.util.List;

public class MotoCruiser extends Motocicleta {
    
    private String ergonomiaPostura;
    private double volumenSonidoEscape;
    private boolean testConfortActivado;

    public MotoCruiser() {
    }

    public MotoCruiser(String ergonomiaPostura, double volumenSonidoEscape, int idMotocicleta, int idMarca, int idTipoMoto, LocalDate fechaCreacion, List<Componente> componentes) {
        super(idMotocicleta, idMarca, idTipoMoto, fechaCreacion, componentes);
        this.ergonomiaPostura = ergonomiaPostura;
        this.volumenSonidoEscape = volumenSonidoEscape;
    }

    public String getErgonomiaPostura() {
        return ergonomiaPostura;
    }

    public void setErgonomiaPostura(String ergonomiaPostura) {
        this.ergonomiaPostura = ergonomiaPostura;
    }

    public double getVolumenSonidoEscape() {
        return volumenSonidoEscape;
    }

    public void setVolumenSonidoEscape(double volumenSonidoEscape) {
        this.volumenSonidoEscape = volumenSonidoEscape;
    }

    public boolean isTestConfortActivado() {
        return testConfortActivado;
    }

    public void setTestConfortActivado(boolean testConfortActivado) {
        this.testConfortActivado = testConfortActivado;
    }
    
    public void activarTestConfort(){
        testConfortActivado = true;
    }

    public String calcularErgonomiaPostura(){
        int puntos = 0;
        for(Componente c : componentes){
            // Manillar
            if(c.getNombre().contains("Harley-Davidson Ape Hanger")){
                puntos += 4;
            }
            if(c.getNombre().contains("Indian Scout Bobber")){
                puntos += 3;
            }
            if(c.getNombre().contains("Ducati Monster")){
                puntos += 2;
            }
            // Carenaje
            if(c.getNombre().contains("Indian Challenger")){
                puntos += 4;
            }
            if(c.getNombre().contains("Harley-Davidson Road Glide")){
                puntos += 3;
            }
            if(c.getNombre().contains("Ducati SuperSport")){
                puntos += 2;
            }
        }
        if(puntos >= 7){
            return "Alta comodidad";
        }
        if(puntos >= 5){
            return "Confort equilibrado";
        }
        return "Postura deportiva";
    }
    
    public double calcularVolumenSonidoEscape(){
        for(Componente c : componentes){
            if(c.getNombre().contains("Harley-Davidson Milwaukee-Eight")){
                return 98.0;
            }
            if(c.getNombre().contains("Indian Thunderstroke 111")){
                return 92.0;
            }
            if(c.getNombre().contains("Ducati Testastretta")){
                return 87.0;
            }
        }
        return 80.0;
    }
    
    public String testDeConfort() {
        String ergonomia = calcularErgonomiaPostura();
        double sonido = calcularVolumenSonidoEscape();
        
        if (ergonomia.equals("Alta comodidad") && sonido >= 92) {
            return "La motocicleta ofrece una experiencia de conducción altamente cómoda y relajada, ideal para recorridos largos y conducción tipo touring.";
        }
        if (ergonomia.equals("Confort equilibrado")) {
            return "La configuración mantiene un equilibrio adecuado entre comodidad, estilo cruiser y experiencia de manejo.";
        }
        return "La motocicleta presenta una postura más agresiva y una experiencia de conducción menos orientada al confort prolongado.";
    }

    private int calcularPuntos(String nombre){
        if (nombre.contains("Milwaukee-Eight") || nombre.contains("Thunderstroke 111") || 
        nombre.contains("Harley-Davidson Road Glide") || nombre.contains("Indian Challenger")) {
            return 4;
        }

        if (nombre.contains("Ducati Testastretta") || nombre.contains("Harley-Davidson Fat Boy") || 
        nombre.contains("Indian Chief Dark Horse") || nombre.contains("Ducati Panigale V4")) {
            return 3;
        }

        if (nombre.contains("Ape Hanger") || nombre.contains("Indian Scout Bobber") || 
        nombre.contains("Ducati Monster") || nombre.contains("Ducati SuperSport")) {
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
            "\n\nLa configuración seleccionada ofrece una experiencia premium de conducción, destacando por su comodidad, estabilidad y presencia en carretera. Los componentes elegidos favorecen trayectos largos con una postura relajada y un desempeño sólido en viajes tipo touring.";
        
        }else if(rendimiento >= 6){
            descripcion +=
            "\n\nLa motocicleta mantiene un equilibrio adecuado entre confort, estilo cruiser y maniobrabilidad. La combinación de componentes proporciona una conducción estable y cómoda tanto en recorridos urbanos como en trayectos medios.";

        }else{
            descripcion +=
            "\n\nLa configuración prioriza ciertos aspectos estéticos y deportivos sobre el confort prolongado. Aunque la motocicleta conserva el estilo cruiser, algunos componentes reducen la comodidad y estabilidad en recorridos largos.";
        }
 
        // Ergonomía y Postura
        descripcion +=
            "\n\nErgonomía y postura: " + calcularErgonomiaPostura();
        
        // Volumen sonido
        descripcion +=
            "\nVolumen sonido escape: " + calcularVolumenSonidoEscape() + "dB";
        
        // Test Confort
        if (testConfortActivado) {
            descripcion +=
            "\n\nTest de confort: " + testConfortActivado;
            descripcion +=
            "\n" + testDeConfort();
        }
        
        return new Reporte(0, idMotocicleta, descripcion);
    }

    @Override
    public String toString() {
        return "MotoCruiser{" + "ergonomiaPostura=" + ergonomiaPostura 
                + ", volumenSonidoEscape=" + volumenSonidoEscape + '}';
    } 
}