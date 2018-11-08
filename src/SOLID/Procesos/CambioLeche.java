/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SOLID.Procesos;

import SOLID.Leche.Leche;

/**
 *
 * @author Pedro Mendoza
 */
public class CambioLeche {
    
    public void cambiarTipoLecheDescremada(){
        Leche ldescrem = new Leche();
        ldescrem.usar();
    }
    
    public void cambiarTipoLecheDeslactosada(){
        Leche ldeslac= new Leche();
        ldeslac.usar();
    }    
    
}
