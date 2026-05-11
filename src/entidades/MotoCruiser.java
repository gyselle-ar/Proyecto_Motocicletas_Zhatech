package entidades;

import java.time.LocalDate;
import java.util.List;

public class MotoCruiser extends Motocicleta {
    
    private String ergonomiaPostura;
    private double volumenSonidoEscape;

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

    public String testDeConfort() {
        if (ergonomiaPostura.equalsIgnoreCase("") && volumenSonidoEscape > 0) {
            return "";
        }else{
            return "";
        }
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
        return "MotoCruiser{" + "ergonomiaPostura=" + ergonomiaPostura 
                + ", volumenSonidoEscape=" + volumenSonidoEscape + '}';
    } 
}