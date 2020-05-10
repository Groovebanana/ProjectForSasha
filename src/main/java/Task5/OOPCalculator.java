package Task5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class OOPCalculator {

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

            System.out.print("Введите первое число: ");
            Calculator calc = new Calculator(Double.parseDouble(reader.readLine()));
            double b;
            while (true) {
                System.out.printf("Доступные действия с числом %.2f:\n1. прибавить\n2. вычесть\n3. умножить\n4. разделить\n5. закончить вычисления\n", calc.getResult());

                System.out.print("Введите номер действия: ");
                int action = Integer.parseInt(reader.readLine());

                if (action < 1 || action > 5) {
                    System.out.println();
                    System.out.println("Действия под таким номером не существует");
                    System.out.println();
                    continue;
                }
                if (action == 5) {
                    calc.showResult();
                    break;
                }

                System.out.print("Введите число: ");

                b = Double.parseDouble(reader.readLine());
                System.out.println();

                switch (action) {
                    case 1:
                        calc.add(b);
                        break;
                    case 2:
                        calc.substract(b);
                        break;
                    case 3:
                        calc.multiply(b);
                        break;
                    case 4:
                        if (b == 0.0) {
                            System.out.println("На ноль делить нельзя!");
                            System.out.println();
                            continue;
                        }
                        calc.divide(b);
                        break;
                    default:
                        System.out.println("Действия под таким номером не существует");
                        break;
                }
            }

        } catch (NumberFormatException e) {
            System.out.println("Вы ввели не число, не надо так");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
