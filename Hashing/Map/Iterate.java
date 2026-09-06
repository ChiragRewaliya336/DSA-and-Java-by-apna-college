package Hashing.Map;
import java.util.HashMap;
public class Iterate {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Chirag", 20);
        map.put("Rahul", 25);
        map.put("Abhishek", 21);
        for(String key : map.keySet()) System.out.println(key +" "+map.get(key));
    }
}
