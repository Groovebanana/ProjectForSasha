import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ArrayMaxElement {

    public static void start() {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

            System.out.println("Введите размер массива");
            int arraySize = Integer.parseInt(reader.readLine());
            String[] arr = new String[arraySize];

            for (int i = 0; i < arraySize; i++) {
                System.out.printf("Введите %d-й элемент: ", i + 1);
                arr[i] = reader.readLine();
            }

            String maxElement = arr[1];
            for (int i = 1; i < arraySize; i++) {
                if (arr[i].length() > maxElement.length()) maxElement = arr[i];
            }

            System.out.printf("Самое длинное слово - \"%s\"\n", maxElement);

        } catch (Exception e) {
            System.out.println("Что то явно пошло не так");
        }
    }

}
