package entidades;

public class MotoTrabajo extends Motocicleta {
    
    private int capacidadCarga;
    private float consumoCombustible;

    public MotoTrabajo() {
    }

    public MotoTrabajo(int capacidadCarga, float consumoCombustible, String marca, String tipoCarenaje, String tipoMotor, String tipoRuedas, String tipoManillar, boolean estadoMotor) {
        super(marca, tipoCarenaje, tipoMotor, tipoRuedas, tipoManillar, estadoMotor);
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

    public void testDeResistencia() {

    }

    @Override
    public String getInstrucciones() {
        return "Instrucciones específicas para Moto de Trabajo.";
    }


    @Override public boolean encenderSistema() { return true; }
    @Override public boolean testearCompatibilidad() { return true; }
    @Override public String generarReporte() { return "Reporte de resistencia de carga."; }
    @Override public void configurarComponentes() { }
    @Override public void resetearConfiguracion() { }

    @Override
    public String toString() {
        return "MotoTrabajo{" + "capacidadCarga=" + capacidadCarga + ", consumo=" + consumoCombustible + "} " + super.toString();
    }
}
