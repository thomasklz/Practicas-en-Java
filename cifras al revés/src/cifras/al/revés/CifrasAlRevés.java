/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cifras.al.revés;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class CifrasAlRevés {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int  num, c, d, u;
        Scanner Entrada = new Scanner(System.in);
        do {            
            System.out.print("Introduzca un número entre 0 y 999: ");
            num=Entrada.nextInt();
            if(num>999){
                System.out.println("Número no permitido");
            }
        } while (num>999);
        // unidad
        u = num % 10;
        num = num / 10;
        // decena
        d = num % 10;
        num = num / 10;
        // centena
        c = num % 10;
        // lo imprimimos al revés:
        System.out.println (u + " " + d + " " + c);
    }
    
}
