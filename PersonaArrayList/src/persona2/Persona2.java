
package persona2;

import java.util.ArrayList;
import java.util.Scanner;


public class Persona2 {

  
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Datos2 objDatos = new Datos2();
        //String [] array = new String [2];
        ArrayList<String> arrayList = new ArrayList();
        int op,i=0;
        do { 
            System.out.println("::::::: MENU :::::");
            System.out.println("1) add");
            System.out.println("2) show");
            System.out.println("3) delete");
            System.out.println("4) exit");
            System.out.println("Elija una opcion");
            op = entrada.nextInt();
            switch(op){
                case 1:
                    System.out.println("Datos: "+ (i+1));
                    System.out.println("Ingrese un nombre");
                    objDatos.setNombre(entrada.next());
                    System.out.println("Ingrese apellido");
                    objDatos.setApellido(entrada.next());
                    System.out.println("Ingrese cedula");
                    objDatos.setCedula(entrada.nextInt()); 
                    objDatos.almacenarDatos(arrayList, i, objDatos.getNombre(), objDatos.getApellido(), objDatos.getCedula());  
                    i++;
                    break;
                case 2:
                    for (int j = 0; j < arrayList.size(); j++) {
                        System.out.println((j+1)+")"+arrayList.get(j));
                    }
                     break;
                case 3:
                    for (int j = 0; j < arrayList.size(); j++) {
                        System.out.println((j+1)+")"+arrayList.get(j));
                    }
                    System.out.println("Elija indice que desea eliminar");
                    int dete= entrada.nextInt();
                    arrayList.remove(dete);
                    break;
            }
        
        } while (op != 4);
        
        
       
        
        
      
        
    
                
        
        
    }
    
}
