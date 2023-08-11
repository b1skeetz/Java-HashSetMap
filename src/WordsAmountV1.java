import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class WordsAmountV1 {
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
        System.out.println(wordsCount);
    }
}