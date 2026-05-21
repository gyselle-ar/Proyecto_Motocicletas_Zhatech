
package entidades;

import java.util.ArrayList;
import java.util.List;

public class ValidadorCompatibilidad {
    
    public String validarCompatibilidad(String componente1, String componente2){

        List<String> incompatibles = new ArrayList<>();

        incompatibles.add(
            "Honda Fireblade#Yamaha MT Series#El carenaje Honda Fireblade es incompatible con el manillar Yamaha MT Series.");

        incompatibles.add(
            "Yamaha Crossplane#Honda CBR600RR#El motor Yamaha Crossplane es incompatible con la rueda Honda CBR600RR.");
        
        incompatibles.add(
            "Kawasaki Ninja 400#Honda VTEC#El carenaje Kawasaki Ninja 400 es incompatible con el manillar Honda VTEC.");
        
        incompatibles.add(
            "Honda Fireblade#Yamaha MT Series#El carenaje Honda Fireblade es incompatible con el manillar Victory High Ball.");
        
        incompatibles.add(
            "Indian Thunderstroke 111#Bajaj Pulsar RS200#El motor Indian Thunderstroke 111 es incompatible con el carenaje Bajaj Pulsar RS200.");
        
        incompatibles.add(
            "Victory Freedom 106#TVS Raider#El motor Victory Freedom 106 es incompatible con el manillar TVS Raider.");
        
        incompatibles.add(
            "Ducati Panigale V4#Indian Challenger#La rueda Ducati Panigale V4 es incompatible con el carenaje Indian Challenger.");
        
        incompatibles.add(
            "Bajaj DTS-i#Kawasaki ZX-10R#El motor Bajaj DTS-i es incompatible con la rueda Kawasaki ZX-10R.");
        
        incompatibles.add(
            "Yamaha Crossplane#Indian Chief Dark Horse#El motor Yamaha Crossplane es incompatible con la rueda Indian Chief Dark Horse.");

        String combinacion1 = componente1.trim().toLowerCase() + "#" + componente2.trim().toLowerCase();
        String combinacion2 = componente2.trim().toLowerCase() + "#" + componente1.trim().toLowerCase();

        for(String i : incompatibles){
            if(i.toLowerCase().contains(combinacion1) || i.toLowerCase().contains(combinacion2)){
                return i.split("#", 3)[2];
            }
        }
        return "Componentes Compatibles";
    }
}
