
package ejerciciointefaz;


public class Rectangulo implements Figura{
    
    double lado1;
    double lado2;

    public Rectangulo(double lado1, double lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    
    @Override
    public double CalcularArea() {

        return lado1*lado2;
    }

    @Override
    public double CalcularPerimetro() {

        return (2*lado1)+(2*lado2);
    }
    
}
