
package Ejercicio7;

public class Principal {
    public static void main(String[] args) {
        
      Auto A = new Auto(1212, "Mazda", 2010, 8000000);
      Lujo L = new Lujo(4, 1222, "Lenovo", 2015, 6000000); 
      Camioneta CA = new Camioneta(30, 2, 10, 1230, "Mazda", 2010, 40000000);
      Compacto  CO = new Compacto (3, 1320, "Chevrolet", 2020, 10000000);
      Vagoneta VA = new Vagoneta(2, 19840, "Jeep", 2007, 12000000);
      
       System.out.println(A); 
       System.out.println(L); 
       System.out.println(CA);
       System.out.println(CO);
        System.out.println(VA);
    }

}
