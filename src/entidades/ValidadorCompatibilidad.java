
package entidades;

import java.util.List;

public class ValidadorCompatibilidad {
    
    public String validarCompatibilidad(List<Componente> componentes){
        
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
            return "Incompatibles: x no funciona con y";
        }
        
        return "Componentes Compatibles";  
    }
}
