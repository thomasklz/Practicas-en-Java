/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matematicas;

import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Matematicas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Calendar fecha = Calendar.getInstance();
        
        System.out.println(fecha.get(Calendar.YEAR));
        System.out.println(fecha.get(Calendar.MONTH)+1);
        System.out.println(fecha.get(Calendar.MINUTE));

        
        
        
    }
    
}
