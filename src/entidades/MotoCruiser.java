package entidades;

public class MotoCruiser extends Motocicleta {
    
    private String ergonomiaPostura;
    private double volumenSonidoEscape;

    public MotoCruiser() {
    }

    public MotoCruiser(String ergonomiaPostura, double volumenSonidoEscape, String marca, String tipoCarenaje, String tipoMotor, String tipoRuedas, String tipoManillar, boolean estadoMotor) {
        super(marca, tipoCarenaje, tipoMotor, tipoRuedas, tipoManillar, estadoMotor);
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

    public void testDeConfort() {
    }

    @Override
    public String getInstrucciones() {
        return "Instrucciones específicas para Moto Cruiser.";
    }

    @Override public boolean encenderSistema() { 
    return true; }
    @Override public boolean testearCompatibilidad() { 
    return true; }
    @Override public String generarReporte() { 
    return "Reporte de ergonomía y escape."; }
    @Override public void configurarComponentes() { }
    @Override public void resetearConfiguracion() { }

    @Override
    public String toString() {
        return "MotoCruiser{" + "ergonomia=" + ergonomiaPostura + ", sonidoEscape=" + volumenSonidoEscape + "} " + super.toString();
    }
}