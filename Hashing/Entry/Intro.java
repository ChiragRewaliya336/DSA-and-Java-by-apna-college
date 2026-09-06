package Hashing.Entry;
import java.util.HashMap;
import java.util.Map;
public class Intro {
     public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(10, 20);
        map.put(15, 30);
        map.put(25, 40);
        map.put(50, 60);
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();
            System.out.println(key + " " + value);
        }
    }
}
