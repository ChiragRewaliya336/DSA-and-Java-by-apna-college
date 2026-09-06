package Hashing.Set;

import java.util.HashSet;

public class Iterate {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(75);
        set.add(77);
        set.add(101);
        set.add(80);
        set.add(70);
        set.add(71);
        set.add(78);
        set.add(72);
        for(int ele: set) System.out.print(ele +" ");
        // for(int ele: set)  set.remove(ele); throw an error
    }
}
