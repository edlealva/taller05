/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SOLID.Principal;
import SOLID.Otros.Aderezo;
import SOLID.Postres.Postre;
import SOLID.Procesos.OperacionesAderezo;
/**
 *
 * @author djurado
 */
public class Sistema {
    
    public static void main(String [ ] args){
        // Producir un helado de vainilla y una torta de chocolate, 
        // a ambos agregarles CREMA y FRUTILLAS
        
        // Producir Helado
        Postre helado_vainilla = new Postre("Helado", "Vainilla");
        OperacionesAderezo.anadirAderezoPostre(helado_vainilla, Aderezo.CREMA);
        OperacionesAderezo.anadirAderezoPostre(helado_vainilla, Aderezo.FRUTILLA);
        System.out.println(helado_vainilla);
        
        // Producir Pastel
        Postre pastel_chocolate = new Postre("Pastel", "Chocolate");
        OperacionesAderezo.quitarAderezoPostre(pastel_chocolate, Aderezo.CREMA);
        OperacionesAderezo.anadirAderezoPostre(pastel_chocolate, Aderezo.FRUTILLA);
        System.out.println(pastel_chocolate);
                
    }
    
}
