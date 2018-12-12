/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mayoresymenores;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Mayoresymenores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero, sumaPar=0;
        
        Scanner entrada = new Scanner(System.in);
        do {   
            System.out.println("Ingrese un numero");
            numero= entrada.nextInt();
            if(numero%2==0){
                sumaPar+=numero;
                 if(sumaPar>=150){
                     sumaPar-=numero;
                 }
                System.out.println("suma par: "+sumaPar);  
            }
        } while ((sumaPar<150)||(100 > sumaPar));
        
       
    }    
}
