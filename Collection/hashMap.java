import java.util.HashMap;

public class hashMap {
  public static void main(String[] args) {
    HashMap<String, Integer> wordCount = new HashMap<>();

    String[] words = {"apple", "banana", "apple", "orange", "banana", "apple"};
        
    for (String word : words) {

      if (wordCount.containsKey(word)) {

        wordCount.put(word, wordCount.get(word) + 1);
      } else {

        wordCount.put(word, 1);
      }
    }

    System.out.println(wordCount);
  }
}
