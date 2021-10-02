
package Ejercicio4;


public class Portatil extends Ordenador {
    private double peso;
    private String eslogan;
    public Portatil(double peso, int codigo, double precio) {
        super(codigo, precio);
        this.peso = peso;
        this.eslogan = "Ideal para sus viajes";
    }

    @Override
    public String toString() {
        return "Ordenador Portatil " 
                + eslogan
                + "\nCodigo = " + codigo 
                + "\nPrecio = " + precio
                +"\nPeso = "+peso
                +"\n__________________\n"; 
    }

   
   
    
    
    
    
    
    
}
