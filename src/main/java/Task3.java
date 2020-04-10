import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task3 {

    public static void start() {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.printf("Напишите номер задачи, которую вы хотите выполнить:\n1. Калькулятор\n2. Поиск максимального элемента в массиве\n");
            int num = Integer.parseInt(reader.readLine());
            switch (num) {
                case 1:
                    Calculator.calculate();
                    break;
                case 2:
                    ArrayMaxElement.start();
                    break;
                default:
                    System.out.println("Вы ввели недопустимое значение");
                    break;
            }
        } catch (Exception e) {
            System.out.println("Что то явно пошло не так");
        }


    }

}
