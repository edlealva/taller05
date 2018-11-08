/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SOLID.Procesos;


import SOLID.Otros.Aderezo;
import SOLID.Postres.Postre;

/**
 *
 * @author Pedro Mendoza
 */
public class OperacionesAderezo {
    
    public static void anadirAderezoPostre(Postre postre, Aderezo aderezo){
        postre.getAderezos().add(aderezo);
    }
    
    public static void quitarAderezoPostre(Postre postre, Aderezo aderezo){
        postre.getAderezos().remove(aderezo);
    
    }
    
}
