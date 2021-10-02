
package Ejercicio4;


public class Ordenador {
    protected int codigo;
    protected double precio;

    public Ordenador() {
    }

    public Ordenador(int codigo, double precio) {
        this.codigo = codigo;
        this.precio = precio;
    }

    public int getCodigo() {return codigo;}
    public double getPrecio() {return precio; }

    public void setCodigo(int codigo) {this.codigo = codigo;}
    public void setPrecio(double precio) {this.precio = precio;}    

    @Override
    public String toString() {
        return "Ordenador " 
                + "\nCodigo = " + codigo 
                + " \nPrecio = " + precio
                +"\n__________________\n";
    }
    
   
    
    
    
    
    
}
