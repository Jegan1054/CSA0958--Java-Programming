import java.util.HashMap;
import java.util.Map;
public class DistinctCharacterCount {
    public static void main(String[] args) {
        String input = "hello world";
        Map<Character, Integer> charCountMap = getCharCountMap(input);
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            System.out.println("Character: " + entry.getKey() + ", Count: " + entry.getValue());
        }
    }
    public static Map<Character, Integer> getCharCountMap(String input) {
        Map<Character, Integer> charCountMap = new HashMap<>();
        char[] charArray = input.toCharArray();
        for (char c : charArray) {           
            if (charCountMap.containsKey(c)) {               
                charCountMap.put(c, charCountMap.get(c) + 1);
            } else {
                charCountMap.put(c, 1);
            }
        }        
        return charCountMap;
    }
}
