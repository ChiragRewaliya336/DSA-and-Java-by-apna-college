package Hashing.Set;

import java.util.HashSet;

public class PairDiffernceWithk {
    public boolean findPair(int[] arr, int x) {
        HashSet<Integer> set = new HashSet<>();
        for(int ele: arr){
            int sum = ele + x;
            if(set.contains(sum)) return true;
            set.add(ele);
        }
        return false;
    }
}
