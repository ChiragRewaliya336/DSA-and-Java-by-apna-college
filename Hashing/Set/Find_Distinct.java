package Hashing.Set;

import java.util.HashSet;

public class Find_Distinct {
    public static void main(String[] args) {
        int arr[] ={2,2,2,3};
        HashSet<Integer> set = new HashSet<>();
        for(int ele: arr) set.add(ele);
        System.out.println(set.size());
    }
}
