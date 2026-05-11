package entidades;

import java.time.LocalDate;
import java.util.List;

public class MotoDeportiva extends Motocicleta {
    
    private double aerodinamica;
    private boolean modoPista;
    private boolean turboActivado;

    public MotoDeportiva() {
    }

    public MotoDeportiva(double aerodinamica, boolean modoPista, boolean turboActivado, int idMotocicleta, int idMarca, int idTipoMoto, LocalDate fechaCreacion, List<Componente> componentes) {
        super(idMotocicleta, idMarca, idTipoMoto, fechaCreacion, componentes);
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
        return "MotoDeportiva{" + "aerodinamica=" + aerodinamica 
                + ", modoPista=" + modoPista + '}';
    }
}
