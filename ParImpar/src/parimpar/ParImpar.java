/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parimpar;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ParImpar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.print("Introduzca un número entero: ");
        numero = sc.nextInt(); 
        if(numero%2==0)
           System.out.println("Par");    
        else
            System.out.println("Impar");  
    }
    
}
