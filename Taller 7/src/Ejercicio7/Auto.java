
package Ejercicio7;


public class Auto {
    
  protected   int  serieMotor;
  protected String marca;
  protected int año;
  protected double precio;

    public Auto() {
    }

    public Auto(int serieMotor, String marca, int año, double precio) {
        this.serieMotor = serieMotor;
        this.marca = marca;
        this.año = año;
        this.precio = precio;
    }

    public int getSerieMotor() { return serieMotor;  }
    public void setSerieMotor(int serieMotor) {     this.serieMotor = serieMotor;    }
    public String getMarca() {        return marca;    }
    public void setMarca(String marca) {       this.marca = marca;    }
    public int getAño() {        return año;    }
    public void setAño(int año) {        this.año = año;    }
    public double getPrecio() {        return precio;    }
    public void setPrecio(double precio) {        this.precio = precio;  }

    
   public String toString() {
        return "Auto" + "\nSerie del Motor: "+ serieMotor + 
                "\nMarca: " + marca + 
                "\nAño: " + año + 
                "\nPrecio: " + precio+
                "\n------------------------";
    }
   
  
  
  
    
}
