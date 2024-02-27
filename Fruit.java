import java.util.HashMap;
import java.util.Map;

public class Fruit {
    public static void main(String[] args) {
        String[] words = {"apple", "orange", "banana", "apple", "grape", "orange", "apple", "kiwi", "banana", "orange"};

        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            if (wordCount.containsKey(word)) {
                wordCount.put(word, wordCount.get(word) + 1);
            } else {
                wordCount.put(word, 1);
            }
        }

        System.out.println("Уникальные слова:");
        for (String word : wordCount.keySet()) {
            System.out.println(word + " - " + wordCount.get(word) + " раз(а)");
        }
    }
}