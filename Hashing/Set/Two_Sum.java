package Hashing.Set;

import java.util.HashSet;

public class Two_Sum {
    public static boolean twoSum(int arr[], int target) {
        HashSet<Integer> set = new HashSet<>();
        for (int ele : arr) {
            int num = target - ele;
            if (set.contains(num)) {
                return true;
            }
            set.add(ele);
        }
        return false;
    }
}
