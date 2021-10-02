
package Ejercicio6;


public class Principal {
    public static void main(String[] args) {
        
        Asalariado AS = new Asalariado (12000, 3);
        PorHoras PH = new PorHoras(45, 12000, 10000);
      PorComision PC = new PorComision(20, 300000);
         AsaPorComision APC = new AsaPorComision(12, 200000, 12000, 5);
         
        System.out.println(AS);
        System.out.println(PH);
        System.out.println(PC);
        System.out.println(APC);
    }
 
}
