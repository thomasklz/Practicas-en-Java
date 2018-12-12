/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplo10;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Multiplo10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner (System.in);
       
       for(int j=1;j<=12;j++){
           for(int i=1;i<=12;i++){
             int multip=j*i;
               System.out.println("l serie es"+j+ '*'+i+ '='+multip);
           }
           System.out.println("\n");
       }
    }
    
}
