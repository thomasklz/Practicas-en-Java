/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funciones;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Funciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int numero ;
       // System.out.println("Ingrese un numero");
        //numero = entrada.nextInt();
        numero= numeroAleatroios(1,10);
        while (divisibleDos(numero)!= true){
            
            System.out.println("El número ingresado es " + numero + ",solo se permiten numero pares");
            //System.out.println("Por favor, ingrese otro número");
            //numero = entrada.nextInt();
            numero= numeroAleatroios(1,10);
         
        }
        System.out.println("El numero ingresado es :"+ numero);
        
    }
    
    public static boolean divisibleDos(int numero) {
        if(numero%2==0)
            return true;
        else
             return false;
    }
    public static int numeroAleatroios(int max, int mini) {
        
        
        //return (int) (Math.random()*10)+1;
        return (int) (Math.random()*(max-mini+1))+mini;
        
    }
  
}
