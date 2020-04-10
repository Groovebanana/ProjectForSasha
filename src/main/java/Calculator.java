import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Второе задание - калькулятор
 *
 * @author AndreevMP
 */
public class Calculator {

    /**
     * Реализация калькулятора
     */
    public static void calculate() {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

            System.out.printf("Напишите номер нужного действия:\n1. Сложение\n2. Вычитание\n3. Умножение\n4. Деление\n");
            int number = Integer.parseInt(reader.readLine());

            if (number < 1 || number > 4) {
                System.out.println("Вы ввели недопустимое значение!");
                return;
            }

            System.out.println("Введите первое число");
            double num1 = Double.parseDouble(reader.readLine());

            System.out.println("Введите второе число");
            double num2 = Double.parseDouble(reader.readLine());

            switch (number) {
                case 1:
                    sum(num1, num2);
                    break;
                case 2:
                    sub(num1, num2);
                    break;
                case 3:
                    mult(num1, num2);
                    break;
                case 4:
                    div(num1, num2);
                    break;
            }

        } catch (Exception e) {
            System.out.println("Что то явно пошло не так");
        }
    }

    private static void sum(double num1, double num2) {
        double res = num1 + num2;

        System.out.printf("Результат сложения: %.4f\n", res);
    }

    private static void sub(double num1, double num2) {
        double res = num1 - num2;

        System.out.printf("Результат вычитания: %.4f\n", res);
    }

    private static void mult(double num1, double num2) {
        double res = num1 * num2;

        System.out.printf("Результат умножения: %.4f\n", res);
    }

    private static void div(double num1, double num2) {
        double res = num1 / num2;

        System.out.printf("Результат деления: %.4f\n", res);
    }
}
