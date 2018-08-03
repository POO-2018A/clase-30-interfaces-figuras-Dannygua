
package ejerciciointefaz;


public class Circulo implements Figura{

    final double pi = 3.14;
    double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }
    
    
    
    @Override
    public double CalcularArea() {

        return pi*(radio*radio);
    }

    @Override
    public double CalcularPerimetro() {

        return 2*pi*radio;
    }
    
}
