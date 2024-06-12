import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
public class MostFrequentWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a paragraph:");
        String paragraph = scanner.nextLine();
        System.out.println("Enter banned words separated by spaces:");
        String[] bannedWords = scanner.nextLine().split(" ");
        String result = mostFrequentWord(paragraph, bannedWords);
        System.out.println("The most frequent non-banned word is: " + result);
        scanner.close();
    }
    public static String mostFrequentWord(String paragraph, String[] banned) {
        String normalizedParagraph = paragraph.replaceAll("[^a-zA-Z ]", " ").toLowerCase();
        String[] words = normalizedParagraph.split("\\s+");
        Set<String> bannedSet = new HashSet<>();
        for (String word : banned) {
            bannedSet.add(word.toLowerCase());
        }
        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            if (!bannedSet.contains(word) && !word.isEmpty()) {
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            }
        }
        String mostFrequentWord = "";
        int maxCount = 0;
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            if (entry.getValue() > maxCount) {
                mostFrequentWord = entry.getKey();
                maxCount = entry.getValue();
            }
        }
        return mostFrequentWord;
    }
}