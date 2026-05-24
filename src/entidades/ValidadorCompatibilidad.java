
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
            "Harley-Davidson Ape Hanger#Ducati Panigale V4#El manillar Harley-Davidson Ape Hanger es incompatible con las ruedas Ducati Panigale V4.");
        
        incompatibles.add(
            "Harley-Davidson Fat Boy#Ducati SuperSport#Las ruedas Harley-Davidson Fat Boy son incompatibles con el carenaje Ducati SuperSport.");
        
        incompatibles.add(
            "Harley-Davidson Milwaukee-Eight#Ducati SuperSport#El motor Harley-Davidson Milwaukee-Eight es incompatible con el carenaje Ducati SuperSport.");
        
        incompatibles.add(
            "Victory High Ball#TVS Apache RR#El manillar Victory High Ball es incompatible con el carenaje TVS Apache RR.");
        
        incompatibles.add(
            "Victory Octane#Bajaj Pulsar RS200#Las ruedas Victory Octane son incompatibles con el carenaje Bajaj Pulsar RS200.");
        
        incompatibles.add(
            "Victory Freedom 106#TVS Apache RR#El motor Victory Freedom 106 es incompatible con el carenaje TVS Apache RR.");

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
