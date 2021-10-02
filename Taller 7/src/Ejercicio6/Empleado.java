
package Ejercicio6;


public class Empleado {
  
    double SalarioFijo;
    double SemanasTrabajadas;

    public Empleado() {
    }

    public Empleado(double SalarioFijo, double SemanasTrabajadas) {
        this.SalarioFijo = SalarioFijo;
        this.SemanasTrabajadas = SemanasTrabajadas;
    }

    public double getSalarioFijo() {return SalarioFijo;}
    public void setSalarioFijo(double SalarioFijo) {this.SalarioFijo = SalarioFijo;}
    public double getSemanasTrabajadas() {return SemanasTrabajadas;}
    public void setSemanasTrabajadas(double SemanasTrabajadas) {this.SemanasTrabajadas = SemanasTrabajadas;}
    
    public double CalcNomina(){
    double nomina =this.SalarioFijo*this.SemanasTrabajadas;
    return nomina;   
    
    }
    public String toString() {
        return "Empleado "+"\nNomina: " +CalcNomina()+"\n____________\n";
    }
    
    
    
}
