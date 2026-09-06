package Hashing.Entry;

import java.util.HashMap;
import java.util.Map;

public class Query {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(10, 15);
        map.put(20, 30);
        map.put(30, 20);
        map.put(40, 50);
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 20) {
                System.out.println(entry.getKey());
            }
        }
    }
}
