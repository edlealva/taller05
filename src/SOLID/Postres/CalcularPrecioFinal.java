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
public class CalcularPrecioFinal {
    
    public double calcularPrecioFinal(double precioParcial, ArrayList<Aderezo> aderezos){
        double precioFinal;
        precioFinal=(precioParcial+(precioParcial*0.12))+(aderezos.size()*0.50);
        return precioFinal;
    }
    
}
