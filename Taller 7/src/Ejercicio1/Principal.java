
package Ejercicio1;


public class Principal {
    public static void main(String[] args) {
        
       Persona p = new Persona(1234567, "Juan ", "Pertus", 25); 
       mostrar(p);
       Futbolista f = new Futbolista(12, "Delante", 103455, "Eduardo ", "Ruiz ", 20); 
       mostrar(f);
        Entrenador e = new Entrenador("1234232", 321450, "Jose", "Cruz", 20);
        mostrar(e);
        Masajista m = new Masajista("Masajista", 2, 12220, "Juan ", "alvarado", 30);
        mostrar(m);
    }
 
    public static void mostrar(Persona a){
    
        System.out.println("yo "+a.getNombre()+a.getApellido());
        a.concentrarse();
        a.viajar();
        System.out.println("____________________");
    }
   
    
   public static void mostrar(Futbolista a){
    
        System.out.println("yo "+a.getNombre()+a.getApellido());
        a.concentrarse();
        a.viajar();
        a.entrenar();
        a.jugarPartido();
        System.out.println("____________________");
    }
    public static void mostrar(Entrenador a){
    
        System.out.println("yo "+a.getNombre()+a.getApellido());
        a.concentrarse();
        a.viajar();
        a.dirigirEntrenamiento();
        a.dirigirPartido();
        System.out.println("____________________");
    }
    
    public static void mostrar(Masajista a){
    
        System.out.println("yo "+a.getNombre()+a.getApellido());
        a.concentrarse();
        a.viajar();
        a.darMasaje();
        System.out.println("____________________");
    }
    
}
