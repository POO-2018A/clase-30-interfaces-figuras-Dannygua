
package ejerciciointefaz;

public class Cuadrado implements Figura{

    double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }
    
    @Override
    public double CalcularArea() {
       return lado*lado;
    }

    @Override
    public double CalcularPerimetro() {
       return lado*4;
    }
    
    
    
}
