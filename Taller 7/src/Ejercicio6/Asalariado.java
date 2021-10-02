
package Ejercicio6;


public class Asalariado extends Empleado{

    public Asalariado(double SalarioFijo, double SemanasTrabajadas) {
        super(SalarioFijo, SemanasTrabajadas);
    }

    
    
    @Override
    public double CalcNomina(){
    double nomina =this.SalarioFijo*this.SemanasTrabajadas;
    return nomina;   
    
    }
    
    
    @Override
    public String toString() {
        return "Empleado Asalariado "+"\nNomina: " +CalcNomina()+"\n____________\n";
    }
    
    
    
    
    
    
}
