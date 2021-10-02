
package Ejercicio6;


public class PorComision extends Empleado{
    double PorcentajeVentas;
   double ventas;

   
   
   
    public PorComision(double PorcentajeVentas, double ventas) {
        this.PorcentajeVentas = PorcentajeVentas;
        this.ventas = ventas;
    }

    public PorComision(double PorcentajeVentas, double ventas, double SalarioFijo, double SemanasTrabajadas) {
        super(SalarioFijo, SemanasTrabajadas);
        this.PorcentajeVentas = PorcentajeVentas;
        this.ventas = ventas;
    }
    
    

    @Override
    public double CalcNomina() {
        double nomina=0;
        double porventas=0;
          porventas= (PorcentajeVentas/100);
        nomina= this.ventas*porventas;
        
        
        return nomina; 
    }
   
   
   
    @Override
    public String toString() {
        return "Empleado Por Comision "+"\nNomina: " +CalcNomina()+"\n____________\n";
    }
    
    
    
   
   
}
