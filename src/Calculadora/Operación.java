package Calculadora;

public class Operación {
    private double a;
    private double b;

    public Operación(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double suma() {
        return a + b;
    }

    public double resta() {
        return a - b;
    }

    public double multiplicación() {
        return a * b;
    }

    public double division() {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Error: No se puede dividir por cero.");
            return Double.NaN; // Valor no numérico
        }
    }
}
