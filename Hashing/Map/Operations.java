package Hashing.Map;
import java.util.*;

public class Operations {
    public static void main(String[] args) {
        // FOr create a HashMap you should declare it key datatype and also value datatype:
        HashMap<String, Integer>Data = new HashMap<>();
        
        // For insert a value into the HashMap, all the key are must be unique because if you wannna add two same key it will override the old value and upadated with the new value.
        Data.put("india", 100);
        Data.put("Russia", 150);
        Data.put("China", 500);
        Data.put("Taiwan", 500);

        // For Print the HashMap just write the name of the HashMap intoo sout command
        System.out.println(Data);

        // For accessing the vaue of the HashMAp, if you wirte the key which is nt exist into th hashmap it will print null
        int populatn = Data.get("india");
        System.out.println(populatn);

        // Containskey method is used for check that the key is exits into the hashmap if yes then return true if not it will return false
        System.out.println(Data.containsKey("China"));
        System.out.println(Data.containsKey("china"));

        // Remove: This method is used to remove any node form the hashmap, if you enter the node which is not exist it will give return null
        System.out.println(Data.remove("Taiwan"));
        System.out.println(Data);

        // For print the size of the hashmap
        System.out.println(Data.size());

        // for checking that the hashmap is empty or not 
        System.out.println(Data.isEmpty());

        // For clear all the nodes from the hashmap
        Data.clear();
        System.out.println(Data);
    }
    
}
