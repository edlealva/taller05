/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SOLID.Postres;

import Otros.Aderezo;
import java.util.ArrayList;

/**
 *
 * @author jfherrer
 */
public  class Postre {
    private String postre;
    private String sabor;
    private double precioParcial;
    private ArrayList<Aderezo> aderezos;
    
    public Postre(String sabor, String postre){
        aderezos = new ArrayList<>();
        this.sabor = sabor;
        this.postre = postre;
    }
        
    public double calcularPrecioFinal(){
        double precioFinal;
        precioFinal = (precioParcial+(precioParcial*0.12))+(aderezos.size()*0.50);
        return precioFinal;
    }

    public ArrayList<Aderezo> getAderezos() {
        return aderezos;
    }

    @Override
    public String toString() {
        return "Postre: " + postre + "{" + "sabor= " + sabor + ", precioParcial= " + precioParcial + ", aderezos= " + aderezos + "}" ;
    }
    
}
