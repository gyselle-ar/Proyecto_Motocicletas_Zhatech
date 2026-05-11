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
        return "MotoCruiser{" + "ergonomiaPostura=" + ergonomiaPostura 
                + ", volumenSonidoEscape=" + volumenSonidoEscape + '}';
    } 
}