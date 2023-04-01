import java.util.HashMap;

public class WordCount {
    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog";

        HashMap<String, Integer> wordCount = new HashMap<>();
        String[] words = input.split(" ");

        for (String word : words) {
            if (wordCount.containsKey(word)) {
                wordCount.put(word, wordCount.get(word) + 1);
            } else {
                wordCount.put(word, 1);
            }
        }

        System.out.println("Word count:");
        for (String word : wordCount.keySet()) {
            System.out.println(word + ": " + wordCount.get(word));
        }
    }
}