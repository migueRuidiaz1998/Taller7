
package Ejercicio1;


public class Futbolista extends Persona {
    private int dorsal;
    private String demarcacion;

    

    public Futbolista(int dorsal, String demarcacion, int id, String nombre, String apellido, int edad) {
        super(id, nombre, apellido, edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    public int getDorsal() {return dorsal; }
    public String getDemarcacion() {return demarcacion;}

    public void setDorsal(int dorsal) {this.dorsal = dorsal; }
    public void setDemarcacion(String demarcacion) { this.demarcacion = demarcacion;}
    
    
    
    @Override
    public void concentrarse(){
      System.out.println("Me concentro mucho para jugar ");
  
  
  }
    
    @Override
   public void viajar()  {
    System.out.println("Viajo mucho por el juego");

} 
    
    
    
    public void entrenar(){
        System.out.println("Entrenemos para el partido");
    
    
    
    }
    
    
    public void jugarPartido(){
        System.out.println("A jugar");
    
    }
    
    
    
    
    
    
}
