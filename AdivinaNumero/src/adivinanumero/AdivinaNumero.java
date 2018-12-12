/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adivinanumero;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class AdivinaNumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int  n, num;
        n=(int)(Math.random()*100)+1;
        Scanner Entrada = new Scanner (System.in);
        System.out.print("Introduce número del 1 al 100: ");
        num=Entrada.nextInt();
        while(num!=n) // mientras no coincidan ambos números
        {
            if(num>n)
                System.out.println("menor");
            else
                System.out.println("mayor");
            System.out.print("Introduce número: ");
            num=Entrada.nextInt();
        }
        // al salir del mientras tenemos la certeza que num es igual a n
       
        System.out.println("acertaste...");

    }
    
}
