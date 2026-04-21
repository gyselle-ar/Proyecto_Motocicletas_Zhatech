package entidades;

public abstract class Motocicleta implements Testeable {
    
    private String marca;
    private String tipoCarenaje;
    private String tipoMotor;
    private String tipoRuedas;
    private String tipoManillar;
    private boolean estadoMotor;

    
    public Motocicleta() {
    }
    
    public Motocicleta(String marca, String tipoCarenaje, String tipoMotor,
                       String tipoRuedas, String tipoManillar, boolean estadoMotor) {
        this.marca = marca;
        this.tipoCarenaje = tipoCarenaje;
        this.tipoMotor = tipoMotor;
        this.tipoRuedas = tipoRuedas;
        this.tipoManillar = tipoManillar;
        this.estadoMotor = estadoMotor;
    }
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipoCarenaje() {
        return tipoCarenaje;
    }

    public void setTipoCarenaje(String tipoCarenaje) {
        this.tipoCarenaje = tipoCarenaje;
    }

    public String getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    public String getTipoRuedas() {
        return tipoRuedas;
    }

    public void setTipoRuedas(String tipoRuedas) {
        this.tipoRuedas = tipoRuedas;
    }

    public String getTipoManillar() {
        return tipoManillar;
    }

    public void setTipoManillar(String tipoManillar) {
        this.tipoManillar = tipoManillar;
    }

    public boolean isEstadoMotor() {
        return estadoMotor;
    }

    public void setEstadoMotor(boolean estadoMotor) {
        this.estadoMotor = estadoMotor;
    }

    public abstract String getInstrucciones();

    @Override
    public boolean encenderSistema() {
        return true;}

    @Override
    public boolean testearCompatibilidad() {
        return true;}

    @Override
    public String generarReporte() {
        return "Reporte de compatibilidad.";}

    @Override
    public void configurarComponentes() {}

    @Override
    public void resetearConfiguracion() {}
    
    @Override
    public String toString() {
        return "Motocicleta{" + "marca=" + marca + ", tipoCarenaje=" + tipoCarenaje +
                ", tipoMotor=" + tipoMotor + ", tipoRuedas=" + tipoRuedas +
                ", tipoManillar=" + tipoManillar + ", estadoMotor=" + estadoMotor + '}';
    }
}