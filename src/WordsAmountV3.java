import java.util.HashMap;

public class WordsAmountV3 {
    public static void main(String[] args) {
        String[] words = new String[]{"liquid", "map", "liquid", "tax", "liquid", "map"};
        // Определить сколько раз встречается каждое слово из массива words.
        // Ожидаемый результат:
        // liquid: 3
        // map: 2
        // tax: 1

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