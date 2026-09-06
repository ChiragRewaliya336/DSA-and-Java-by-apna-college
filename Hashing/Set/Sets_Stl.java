package Hashing.Set;

import java.util.HashSet;

public class Sets_Stl {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(75);
        set.add(77);
        set.add(77);
        set.add(77);
        System.out.println(set.size());
        System.out.println(set.contains(25));
        set.remove(77);
        set.add(101);
        set.add(80);
        set.add(70);
        set.add(71);
        set.add(78);
        set.add(72);
        System.out.println(set);
    }
}
