
package entidades;

import java.util.ArrayList;
import java.util.List;

public class ValidadorCompatibilidad {
    
    public String validarCompatibilidad(String componente1, String componente2){

        List<String> incompatibles = new ArrayList<>();

        incompatibles.add(
            "Harley-Davidson Milwaukee#Kawasaki Ninja 400#El motor Harley-Davidson Milwaukee es incompatible con el carenaje Kawasaki Ninja 400.");

        incompatibles.add(
            "Kawasaki Ninja H2#Harley-Davidson Ape Hanger#El motor Kawasaki Ninja H2 es incompatible con el manillar Harley-Davidson Ape Hanger.");
        
        incompatibles.add(
            "TVS Apache RTR#Harley-Davidson Fat Boy#El motor TVS Apache RTR es incompatible con la rueda Harley-Davidson Fat Boy.");
        
        incompatibles.add(
            "Honda Fireblade#Victory High Ball#El carenaje Honda Fireblade es incompatible con el manillar Victory High Ball.");
        
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
        
        incompatibles.add(
            "Panigale-Manillar Básico-El componente Panigale es incompatible con el manillar básico.");

        String combinacion = componente1 + "#" + componente2;

        for(String i : incompatibles){
            if(i.contains(combinacion)){
                return i.split("#", 3)[2];
            }
        }
        return "Componentes Compatibles";
    }
}
