
package Ejercicio6;


public class AsaPorComision extends PorComision{

    public AsaPorComision(double PorcentajeVentas, double ventas, double SalarioFijo, double SemanasTrabajadas) {
        super(PorcentajeVentas, ventas, SalarioFijo, SemanasTrabajadas);
    }

    
   
    @Override
    public double CalcNomina() {
        double nomina=0;
        double porventas=0;
        porventas= (PorcentajeVentas/100);
        nomina= (ventas*porventas)+(SalarioFijo*SemanasTrabajadas);
        
        
        return nomina; 
    }
   
    @Override
    public String toString() {
        return "Empleado Asalariado Por Comision "+"\nNomina: " +CalcNomina()+"\n____________\n";
    }
    
    
}
