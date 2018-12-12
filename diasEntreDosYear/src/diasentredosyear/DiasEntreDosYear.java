/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diasentredosyear;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class DiasEntreDosYear {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int dia1,mes1,year1;
        int dia2,mes2,year2;
        int total_dias;
        System.out.println("-----------------------------------------------");
        System.out.println("  Mostrar días de diferencia entre dos fechas  ");
        System.out.println("-----------------------------------------------");
        Scanner Entrada = new Scanner(System.in); 
        System.out.println ("Fecha 1:");
        do {  
               System.out.print("Introduzca día: ");  
               dia1=Entrada.nextInt();
               if(dia1>30 || dia1<=0 ){
                    System.out.println("El día no permiten números mayores a 30 ni menores a 0");
               }
        } while (dia1>30 || dia1<=0);
        
        do {  
               System.out.print("Introduzca mes: ");
               mes1=Entrada.nextInt();
               if(mes1>12 || mes1<=0 ){
                    System.out.println("El mes no permiten números mayores a 12 ni menores a 0");
               }
        } while (mes1>12 || mes1<=0);
        
        do {  
               System.out.print("Introduzca año: ");
               year1=Entrada.nextInt();
               if(year1<=0 ){
                    System.out.println("El año no puede ser menores a 0");
               }
        } while (year1<=0);
        System.out.println ("-------------------------------------------------------------------");
        System.out.println ("Fecha 2:");
        do {  
               System.out.print("Introduzca día: ");  
               dia2=Entrada.nextInt();
               if(dia2>30 || dia2<=0 ){
                    System.out.println("El día no permiten números mayores a 30 ni menores a 0");
               }
        } while (dia2>30 || dia2<=0);
        
        do {  
               System.out.print("Introduzca mes: ");
               mes2=Entrada.nextInt();
               if(mes2>12 || mes2<=0 ){
                    System.out.println("El mes no permiten números mayores a 12 ni menores a 0");
               }
        } while (mes2>12 || mes2<=0);
        
        do {  
               System.out.print("Introduzca año: ");
               year2=Entrada.nextInt();
               if(year2<=0 ){
                    System.out.println("El año no puede ser menores a 0");
               }
        } while (year2<=0);
  
        total_dias = dia2-dia1 + 30*(mes2-mes1)+360*(year2-year1);
        System.out.println (" ********* Días de diferencia: " + total_dias);

    }
    
}
