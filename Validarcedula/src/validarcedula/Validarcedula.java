/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validarcedula;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Validarcedula {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        int  num, u10, u9, u8, u7, u6, u5, u4, u3, u2, u1;
        Scanner Entrada = new Scanner(System.in);
              
            System.out.print("Introduzca un número de cédula");
            num=Entrada.nextInt();
            

        // unidad
        u10 = num % 10;
        num = num / 10;
        // decena
        u9 = num % 10;
        num = num / 10;
        // centena
        u8 = num % 10;
        num = num / 10;
        u7 = num % 10;
        num = num / 10;
        u6 = num % 10;
        num = num / 10;
        u5 = num % 10;
        num = num / 10;
        u4 = num % 10;
        num = num / 10;
        u3 = num % 10;
        num = num / 10;
        u2 = num % 10;
        num = num / 10;
        u1 = num % 10;
   
        // lo imprimimos al revés:
        System.out.println (u1 + " " + u2 + " " + u3);
        
    }
    
}
