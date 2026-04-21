package entidades;

public class MotoDeportiva extends Motocicleta {
    
    private double aerodinamica;
    private boolean modoPista;

    public MotoDeportiva() {
    }

    public MotoDeportiva(double aerodinamica, boolean modoPista, String marca, String tipoCarenaje, String tipoMotor, String tipoRuedas, String tipoManillar, boolean estadoMotor) {
        super(marca, tipoCarenaje, tipoMotor, tipoRuedas, tipoManillar, estadoMotor);
        this.aerodinamica = aerodinamica;
        this.modoPista = modoPista;
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

    public void activarTurbo() {

    }

    @Override
    public String getInstrucciones() {
        return "Instrucciones específicas para Moto Deportiva.";
    }

    @Override public boolean encenderSistema() { 
        return true; }
    
    @Override public boolean testearCompatibilidad() { 
        return true; }
    
    @Override public String generarReporte() {
        return "Reporte de compatibilidad deportiva."; }
    
    @Override public void configurarComponentes() { }
    
    @Override public void resetearConfiguracion() { }

    @Override
    public String toString() {
        return "MotoDeportiva{" + "aerodinamica=" + aerodinamica + ", modoPista=" + modoPista + "} " + super.toString();
    }
}
