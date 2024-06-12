import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class WordCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        String[] words = input.split("\\s+");
        Map<String, Integer> wordCountMap = new HashMap<>();
        for (String word : words) {
            String lowercaseWord = word.toLowerCase();
            wordCountMap.put(lowercaseWord, wordCountMap.getOrDefault(lowercaseWord, 0) + 1);
        }
        System.out.println("\nWord Count:");
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        scanner.close();
    }
}