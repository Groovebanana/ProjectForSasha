package Task6;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;

public class Task6 {

    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Введите путь к файлу");
            String path = reader.readLine();
            WordsParser wordsParser = new WordsParser(path);
            wordsParser.parse();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не был найден");
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
