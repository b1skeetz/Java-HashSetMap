import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class WordsAmount {
    public static void main(String[] args) {
        String[] words = new String[]{"liquid", "map", "liquid", "tax", "liquid", "map"};
        // Определить сколько раз встречается каждое слово из массива words.
        // Ожидаемый результат:
        // liquid: 3
        // map: 2
        // tax: 1

        // Вариант 1
        Set<String> uniqueWord = new HashSet<>();
        int counter = 0;
        HashMap<String, Integer> wordsCount = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            if (uniqueWord.add(words[i])) {
                for (int j = i; j < words.length; j++) {
                    if (words[i].equals(words[j])) {
                        counter++;
                    }
                }
                wordsCount.put(words[i], counter);
                counter = 0;
            }
        }

        int counter = 0;
        int j = 0;
        HashMap<String, Integer> wordsCount = new HashMap<>();

        // Вариант 2
        for (int i = 0; i < words.length; i++) {
            if(j == words.length){
                break;
            }
            if (!wordsCount.containsKey(words[j])) {
                if (words[j].equals(words[i])) {
                    counter++;
                }
                if (i == words.length - 1) {
                    if (counter == 0) {
                        counter++;
                    }
                    wordsCount.put(words[j], counter);
                    counter = 0;
                    j++;
                    i = 0;
                }
            } else {
                j++;
                i = 0;
            }
        }

        // Вариант 3
        HashMap<String, Integer> wordsCount = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            if (!wordsCount.containsKey(words[i])) {
                wordsCount.put(words[i], 1);
            } else {
                wordsCount.put(words[i], wordsCount.get(words[i]) + 1);
            }
        }

        System.out.println(wordsCount);
    }
}