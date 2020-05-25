package Task5;

public class Calculator{
    private double a;

    public Calculator(double firstNumber) {
        this.a = firstNumber;
    }

    public double getResult() {
        return a;
    }


    public void add(double b) {
        System.out.println(a + " + " + b);
        a += b;
    }


    public void substract(double b) {
        System.out.println(a + " - " + b);
        a -= b;
    }


    public void multiply(double b) {
        System.out.println(a + " * " + b);
        a *= b;
    }


    public void divide(double b) {
        System.out.println(a + " / " + b);
        if (b==0)
            throw new ArithmeticException("На ноль делить нельзя");
        a /= b;
    }


    public void showResult() {
        System.out.printf("Результат равен %.2f\n", a);
    }
}
