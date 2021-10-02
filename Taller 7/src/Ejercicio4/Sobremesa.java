
package Ejercicio4;


public class Sobremesa  extends Ordenador{
  private String descripcion;
private String eslogan;


    public Sobremesa( int codigo, double precio) {
        super(codigo, precio);
        this.descripcion = "Tipo Torre ";
        this.eslogan = " Es el que más pesa, pero el que menos cuesta ";
    }
  
   @Override
    public String toString() {
        return "Ordenador Sobremesa " 
                + eslogan
                + "\nCodigo = " + codigo 
                +"\nPrecio = "+precio
                + "\nDescripcion = " + descripcion
                +"\n__________________\n"; 
    }
    
  
    
    
}
