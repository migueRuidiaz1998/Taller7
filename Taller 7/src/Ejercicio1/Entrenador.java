
package Ejercicio1;


public class Entrenador extends Persona{
    private String idFederacion;

    public Entrenador(String idFederacion, int id, String nombre, String apellido, int edad) {
        super(id, nombre, apellido, edad);
        this.idFederacion = idFederacion;
    }

    public String getIdFederacion() {return idFederacion;   }
    public void setIdFederacion(String idFederacion) {this.idFederacion = idFederacion; }

    @Override
    public void viajar() {
        System.out.println("Viajo mucho para entrenar a los jugadores"); 
    }

    @Override
    public void concentrarse() {
          System.out.println("Me concentro mucho para entrenar");
    }
    
    public void dirigirPartido(){
    
        System.out.println("Yo dirijo el partido ");
    
    
    }
    public void dirigirEntrenamiento(){
        System.out.println("Yo dirijo el entrenamiento");
    
    
    
    }
    
    
    
    
}
