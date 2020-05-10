package Task5;

public class Calculator implements Calculatable{
    private double a;

    public Calculator(double firstNumber) {
        this.a = firstNumber;
    }

    public double getResult() {
        return a;
    }

    @Override
    public void add(double b) {
        System.out.println(a + " + " + b);
        a += b;
    }

    @Override
    public void substract(double b) {
        System.out.println(a + " - " + b);
        a -= b;
    }

    @Override
    public void multiply(double b) {
        System.out.println(a + " * " + b);
        a *= b;
    }

    @Override
    public void divide(double b) {
        System.out.println(a + " / " + b);
        a /= b;
    }

    @Override
    public void showResult() {
        System.out.printf("Результат равен %.2f\n", a);
    }
}
