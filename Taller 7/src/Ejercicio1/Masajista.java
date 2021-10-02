
package Ejercicio1;


public class Masajista extends Persona{
    private String Titulacion;
    private int añosExperiencia;

    public Masajista(String Titulacion, int añosExperiencia, int id, String nombre, String apellido, int edad) {
        super(id, nombre, apellido, edad);
        this.Titulacion = Titulacion;
        this.añosExperiencia = añosExperiencia;
    }

    public String getTitulacion() { return Titulacion; }
    public int getAñosExperiencia() { return añosExperiencia; }

    public void setTitulacion(String Titulacion) { this.Titulacion = Titulacion; }
    public void setAñosExperiencia(int añosExperiencia) { this.añosExperiencia = añosExperiencia;  }

    @Override
    public void viajar() {
        super.viajar(); 
    }

    @Override
    public void concentrarse() {
        super.concentrarse();
    }
    
    
    
    
    
    
    public void darMasaje(){
    
        System.out.println("Doy buenos masajes ");
    
    }
    
    
    
    
}
