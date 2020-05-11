package Task6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class WordsParser {
    private String fileAdress;
    private ArrayList<String> wordsList;
    private TreeMap<String, Integer> sortedWordsMap = new TreeMap<>();

    public WordsParser(String fileAdress) {
        this.fileAdress = fileAdress;
    }

    private String getWordsFromFile(String fileAdress) throws IOException {
        String words = "";
        String line;
        BufferedReader fileReader = new BufferedReader(new FileReader(fileAdress));
        while ((line = fileReader.readLine()) != null) {
            words += " " + line;
        }
        fileReader.close();
        return words;
    }

    private void setWordsListFromString(String words) {
        String w = words;
        w = w.replace("\n", " ");
        w = w.replace("\t", " ");
        w = w.replaceAll("[_.?!)(,:;]", " ");
        String[] arr = w.split(" ");
        wordsList = new ArrayList<>(Arrays.asList(arr));
        wordsList.sort(String::compareToIgnoreCase);
        wordsList.removeIf(s -> s.equals("") || s.equals(" "));
    }

    private void setWordsCountedMap(ArrayList<String> words) {
        String lowCaseWord;
        int wordsCount;
        for (String word : words) {
            lowCaseWord = word.toLowerCase();
            if (sortedWordsMap.containsKey(lowCaseWord)) {
                wordsCount = sortedWordsMap.get(lowCaseWord);
                wordsCount++;
                sortedWordsMap.put(lowCaseWord, wordsCount);
            } else {
                sortedWordsMap.put(lowCaseWord, 1);
            }
        }
    }

    private void showWordsCount(TreeMap<String, Integer> map) {
        if (map.size() < 1) {
            System.out.println("слов нет");
            return;
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.printf("Слово \"%s\" встречается в файле %d раз(а).\n", entry.getKey(), entry.getValue());
        }
    }
    private void showMaxWordRate(TreeMap<String, Integer> map) {
        int maxRate = 0;
        for (Map.Entry<String, Integer> entry: map.entrySet()) {
            int count = entry.getValue();
            if (count > maxRate) maxRate = count;
        }

        if (maxRate == 0) {
            System.out.println("Слов нет");
            return;
        }

        System.out.println();
        System.out.println("Максимальное количество повторений - " + maxRate + ", максимально повторяющиеся слова:");

        for (Map.Entry<String, Integer> entry: map.entrySet()) {
            if (entry.getValue() == maxRate) {
                System.out.println(entry.getKey());
            }
        }
        System.out.println();

    }
    private void showSortedList(ArrayList<String> list) {
        System.out.println();
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println();
    }

    public void parse() throws IOException {

            setWordsListFromString(getWordsFromFile(fileAdress));
            setWordsCountedMap(wordsList);
            showSortedList(wordsList);
            showWordsCount(sortedWordsMap);
            showMaxWordRate(sortedWordsMap);

    }
}
