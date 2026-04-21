package entidades;

public interface Testeable {
    public boolean encenderSistema();
    public boolean testearCompatibilidad();
    public String generarReporte();
    public void configurarComponentes();
    public void resetearConfiguracion();
}
 
