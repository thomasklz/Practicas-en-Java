/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo;

import java.util.Scanner;
import javax.swing.JOptionPane;


/**
 *
 * @author Usuario
 */
public class HolaMundo {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
       //ñ area=pi *radio^2
    Scanner dato = new Scanner(System.in);
    System.out.println("Ingrese una letra o simbolo");
    char letra = dato.next().charAt(0);
    System.out.println("El código es: "+(int) letra );
    
    
    
    }
    
}
