
package ejerciciointefaz;

public class Triangulo implements Figura{

    double lado1;
    double lado2;
    double base;
    double altura;

    public Triangulo(double lado1, double lado2, double base, double altura) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.base = base;
        this.altura = altura;
    }
     
    
    @Override
    public double CalcularArea() {
        
        return (base*altura)/2;

    }

    @Override
    public double CalcularPerimetro() {

        return lado1+lado2+base;
    }
    
}
