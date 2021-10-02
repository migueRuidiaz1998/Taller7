
package Ejercicio7;


public class Camioneta  extends Auto {
     private int capacidadCarga;
    private int cantidadEje;
    private int cantidadRodadas;

    public Camioneta(int capacidadCarga, int cantidadEje, int cantidadRodadas, int serieMotor, String marca, int año, double precio) {
        super(serieMotor, marca, año, precio);
        this.capacidadCarga = capacidadCarga;
        this.cantidadEje = cantidadEje;
        this.cantidadRodadas = cantidadRodadas;
    }

    
    
 @Override
    public String toString() {
        return "Auto Camioneta " + "\nSerie del Motor: "+ serieMotor + 
                "\nMarca: " + marca + 
                "\nAño: " + año + 
                "\nPrecio: " + precio+
                "\nCapacidad de carga: "+capacidadCarga+
                "\nCantidad de Ejes: "+cantidadEje+
                "\nRodadas: "+cantidadRodadas+
                "\n------------------------";
    }
       
    
    
}
