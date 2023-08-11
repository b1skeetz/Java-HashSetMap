import java.util.HashMap;

public class WordsAmountV2 {
    public static void main(String[] args) {
        String[] words = new String[]{"liquid", "map", "liquid", "tax", "liquid", "map"};
        // Определить сколько раз встречается каждое слово из массива words.
        // Ожидаемый результат:
        // liquid: 3
        // map: 2
        // tax: 1

        // Вариант 2
        int counter = 0;
        int j = 0;
        HashMap<String, Integer> wordsCount = new HashMap<>();

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
        System.out.println(wordsCount);
    }
}