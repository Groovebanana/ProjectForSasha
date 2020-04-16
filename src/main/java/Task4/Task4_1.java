package Task4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task4_1 {

    public static void arrMinMax() {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

            int[] arr = new int[20];
            int element;

            System.out.println("Введите 20 целых чисел от -10 до 10");
            for (int i = 0; i < 20; i++) {
                System.out.printf("\nВведите %d-й элемент: ", i + 1);
                element = Integer.parseInt(reader.readLine());
                if (element < -10 || element > 10) {
                    System.out.println("Вы ввели недопустимое значение, попробуйте снова.");
                    --i;
                } else {
                    arr[i] = element;
                }
            }

            int max = 1;
            int maxIndex = 1;
            int min = 1;
            int minIndex = 1;

            boolean maxFound = false;
            boolean minFound = false;

            for (int i = 0; i < arr.length; i++) {

                if (maxFound && minFound) break;

                int arrElement = arr[i];

                if ( !maxFound && arrElement < 0) {
                    max = arrElement;
                    maxIndex = i;
                    maxFound = true;
                }

                if (!minFound && arrElement > 0) {
                    min = arrElement;
                    minIndex = i;
                    minFound = true;
                }
            }

            for (int i = 0; i < arr.length; i++) {
                int arrElement = arr[i];

                if (arrElement < 0 && arrElement > max) {
                    max = arrElement;
                    maxIndex = i;
                }

                if (arrElement > 0 && arrElement < min) {
                    min = arrElement;
                    minIndex = i;
                }
            }

            System.out.println("максимальный отрицательный элемент = " + max);
            System.out.println("минимальный положительный элемент = " + min);

            arr[maxIndex] = min;
            arr[minIndex] = max;

            for (int i : arr) {
                System.out.print(i + " ");
            }

        }  catch (Exception e) {
            System.out.println("Что то явно пошло не так");
        }
    }
}
