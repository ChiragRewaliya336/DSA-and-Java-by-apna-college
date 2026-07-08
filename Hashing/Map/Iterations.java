package Hashing.Map;

import java.util.HashMap;
import java.util.Set;

public class Iterations {
    public static void main(String[] args) {

        HashMap<String, Integer> Data = new HashMap<>();
        Data.put("india", 100);
        Data.put("Russia", 150);
        Data.put("China", 500);
        Data.put("Taiwan", 500);
        Set<String> keys = Data.keySet();
        System.out.println(keys);
        for (String k : keys) {
            // System.out.println("Key=" +k +", value= " +Data.get(k));
            System.out.println(Data.entrySet());
        }
    }

}
