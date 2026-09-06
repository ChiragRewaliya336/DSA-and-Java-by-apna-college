package Hashing.Map;

import java.util.HashMap;

public class Intro {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("Chirag", 20);
        map.put("Rahul", 25);
        map.put("Abhishek", 21);
        System.out.println(map);
        System.out.println(map.remove("Abhishek"));
        System.out.println(map);
        System.out.println(map.get("Chirag"));
        System.out.println(map.containsKey("Abhishek"));
        System.out.println(map.containsKey("Chirag"));
        System.out.println(map.containsValue(20));
    }
}
