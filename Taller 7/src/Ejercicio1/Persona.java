
package Ejercicio1;


public class Persona {
  protected int id; 
  protected String nombre;
  protected String apellido;
  protected int edad;

    public Persona() {
    }

    public Persona(int id, String nombre, String apellido, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public int getId() {return id;}
    public String getNombre() {return nombre;}
    public String getApellido() {return apellido;}
    public int getEdad() {return edad;}

    public void setId(int id) {this.id = id;}
    public void setNombre(String nombre) {this.nombre = nombre;}
    public void setApellido(String apellido) { this.apellido = apellido;}
    public void setEdad(int edad) { this.edad = edad;  }
  
  public  void concentrarse(){
      System.out.println("Me concentro mucho ");
  
  
  }
  
public  void viajar()  {
    System.out.println("Viajo mucho ");

}
  
  
  
}
