
package Ejercicio7;


public class Lujo extends Auto{
    
    private int pasajeros;

    public Lujo(int pasajeros,int serieMotor, String marca, int año, double precio) {
        super(serieMotor, marca, año, precio);
        this.pasajeros=pasajeros;
        
    }

    public int getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }

    @Override
    public String toString() {
        return "Auto de Lujo " + "\nSerie del Motor: "+ serieMotor + 
                "\nMarca: " + marca + 
                "\nAño: " + año + 
                "\nPrecio: " + precio+
                "\nPasajeros: "+pasajeros+
                "\n------------------------";
    }
    
    
    
    
}
