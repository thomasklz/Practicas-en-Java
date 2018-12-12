/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datosentrada;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class DatosEntrada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int numero1=5, numero2=2, resultado;
       
      
        
       Scanner datos = new Scanner (System.in);
       System.out.println("Ingrese un número entero: ");
       numero1 = datos.nextInt();
       System.out.println("Ingrese otro número entero: ");
       numero2 = datos.nextInt();
       //suma
       resultado= numero1+ numero2;
       System.out.println("El resultdo de la suma es : "+resultado);
       //resta
       resultado= numero1- numero2;
       System.out.println("El resultdo de la resta es : "+resultado);
       //multiplicación
       resultado= numero1* numero2;
       System.out.println("El resultdo de la multiplicación es : "+resultado);
       //división 
       resultado= numero1/numero2;
       System.out.println("El resultdo de la divisón es : "+resultado);
        
       float numero4;
       numero4=(float) numero1 / numero2;
       System.out.printf("Valor: %.3f", numero4 ); 
        
    }
    
}
