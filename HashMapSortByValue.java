import java.util.*;
public class HashMapSortByValue {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Apple", 50);
        map.put("Orange", 20);
        map.put("Banana", 30);
        map.put("Grapes", 40);
        System.out.println("Original HashMap: " + map);
        List<Map.Entry<String, Integer>> list = new LinkedList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue());
        HashMap<String, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        System.out.println("Sorted HashMap by values: " + sortedMap);
    }
}
