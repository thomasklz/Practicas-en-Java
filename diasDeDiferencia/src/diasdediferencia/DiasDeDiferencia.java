/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diasdediferencia;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class DiasDeDiferencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        int dia1,mes1,año1;
        int dia2,mes2,año2;
        int total_dias;
        System.out.println ("Fecha 1:");
        System.out.print("Introduzca día: ");
        dia1=Entrada.nextInt();
        System.out.print("Introduzca mes: ");
        mes1=Entrada.nextInt();
        System.out.print("Introduzca año: ");
        año1=Entrada.nextInt();
        System.out.println ("Fecha 2:");
        System.out.print("Introduzca día: ");
        dia2=Entrada.nextInt();
        System.out.print("Introduzca mes: ");
        mes2=Entrada.nextInt();
        System.out.print("Introduzca año: ");
        año2=Entrada.nextInt();
        // suponemos que las fecha introducidas son correctas
        // convertimos las dos fechas a días y calculamos la diferencia
        total_dias = dia2-dia1 + 30*(mes2-mes1)+365*(año2-año1);
        System.out.println ("Días de diferencia: " + total_dias);
        
    }
    
}
