
package persona2;

import java.util.ArrayList;


public class Datos2 {
    
    private String nombre;
    private String apellido;
    private int cedula;

    public Datos2(String nombre, String apellido, int cedula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
    }

    public Datos2() {
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    @Override
    public String toString() {
        return "Tu nombres es: " + nombre + ", y tu apellido: " + apellido + "y tu cedula: " + cedula + "";
    }

    public void almacenarDatos(ArrayList<String> arrayList, int indicador, String nom, String ape, int cedu){
        
        arrayList.add(nom + " "+ ape +" "+cedu); 
    
    }
    
}
