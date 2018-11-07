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
public abstract class Postre {
    
    private String sabor;
    private double precioParcial;
    private ArrayList<Aderezo> aderezos;
        
    public double calcularPrecioFinal(){
        double precioFinal;
        precioFinal=(precioParcial+(precioParcial*0.12))+(aderezos.size()*0.50);
        return precioFinal;
    }

    public ArrayList<Aderezo> getAderezos() {
        return aderezos;
    }

    @Override
    public String toString() {
        return "Helado{" + "sabor=" + sabor + ", precioParcial=" + precioParcial + ", aderezos=" + aderezos + '}';
    }
    
}
