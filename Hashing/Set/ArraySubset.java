package Hashing.Set;

import java.util.HashMap;
public class ArraySubset {
    public boolean isSubset(int a[], int b[]) {
        HashMap<Integer, Integer> aMap = new HashMap<>();
        for (int ele : a) {
            aMap.put(ele, aMap.getOrDefault(ele, 0) + 1);
        }
        HashMap<Integer, Integer> bMap = new HashMap<>();
        for (int ele : b) {
            if (!aMap.containsKey(ele)) {
                return false;
            }
            bMap.put(ele, bMap.getOrDefault(ele, 0) + 1);
        }
        for (int ele : bMap.keySet()) {
            int freq = bMap.get(ele);
            int afreq = aMap.get(ele);
            if (afreq < freq)
                return false;
        }
        return true;
    }

    class Solution {
        public boolean isSubset(int a[], int b[]) {

            HashMap<Integer, Integer> map = new HashMap<>();
            for (int ele : a) {
                map.put(ele, map.getOrDefault(ele, 0) + 1);
            }
            for (int ele : b) {
                if (!map.containsKey(ele) || map.get(ele) == 0) {
                    return false;
                }
                map.put(ele, map.get(ele) - 1);
            }
            return true;
        }
    }
}
