import java.util.HashMap;
import java.util.Map;
public class UniqueCharacters {
    public static void main(String[] args) {
        String input = "abcb";        
        printUniqueCharacters(input);
    }
    public static void printUniqueCharacters(String input) {
        Map<Character, Integer> charCountMap = new HashMap<>();
        char[] charArray = input.toCharArray();
        for (char c : charArray) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }
        System.out.print("Unique characters: ");
        for (char c : charArray) {
            if (charCountMap.get(c) == 1) {
                System.out.print(c + " ");
            }
        }
    }
}
