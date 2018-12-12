
package matematicas;

public class Operaciones {
    private int numero1;
    private int numero2;

    public Operaciones(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    
    public void setNumero1(int num) {
        this.numero1 = num;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public int getNumero1() {
        return numero1;
    }

    public int getNumero2() {
        return numero2;
    }
   
    public int suma(){
        return numero1 +numero2;
    }
    
    public int resta(){
        return numero1 - numero2;
    }
    
    public void imprimir() {
        System.out.println("La suma es :"+(numero1 + numero2));
        System.out.println("La resta es :"+(numero1 - numero2));
    }
}
