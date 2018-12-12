/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funciones2;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Funciones2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int num1, num2, s;
      float div;
      Scanner entrada= new Scanner(System.in);
     
      System.out.println("Ingrese el primer valor\n");
      num1=entrada.nextInt();
        while (pares(num1)!=true) {
            System.out.println("Numero no permitido\n");
            System.out.println("Ingresa otro valor\n");
            num1=entrada.nextInt();
        }
      
      
      System.out.println("Ingrese el segundo valor\n");
      num2=entrada.nextInt();
      while (pares(num2)!=true) {
            System.out.println("Numero no permitido\n");
            System.out.println("Ingresa otro valor\n");
            num2=entrada.nextInt();
        }
      
      s = suma(num1, num2);
      div=s/4 ; 
      System.out.println("La division es "+div); 
    }
    
    public static int suma(int a, int b){
     return a+b;
    }
    
    public static boolean pares(int numero) {
        if(numero%2==0){
            return true;
        }else{
            return false;
        }
    }
    
    
    
}
