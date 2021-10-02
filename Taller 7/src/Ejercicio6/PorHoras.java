
package Ejercicio6;

public class PorHoras extends Empleado{
    private double NoHoras;
    private double Sueldo;
private int SueldoXHorasextras;

    public PorHoras(int NoHoras, int Sueldo,int SueldoXHorasextras) {
        this.NoHoras = NoHoras;
        this.Sueldo = Sueldo;
        this.SueldoXHorasextras=SueldoXHorasextras;
    }

    public double getNoHoras() {return NoHoras; }
    public double getSueldo() { return Sueldo; }

    public void setNoHoras(double NoHoras) { this.NoHoras = NoHoras;}
    public void setSueldo(double Sueldo) { this.Sueldo = Sueldo; }

    @Override
    public double CalcNomina() {
        double nomina = 0;
        double horasExtras =0;
        
        if (NoHoras>40){
            horasExtras=NoHoras-40;
         nomina = (40*this.Sueldo)+(this.SueldoXHorasextras*horasExtras);
        
        
        }
        else{
      nomina = this.NoHoras*this.Sueldo;
        }
        
        return  +nomina; 
    }

    @Override
    public String toString() {
        return "Empleado Por Horas "+"\nNomina: " +CalcNomina()+"\n____________\n";
    }
    
    
    
    
    
    
}
