package ArrayList;
import java.util.*;
public class swap {
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        int left =0;
        int right = list.size()-1;
        System.out.println("Before Swapping= " +list);
        while (left<=right) {
            int temp = list.get(left);
           list.set(left, list.get(right));
           list.set(right, temp);
           left++;
           right--;
        }
         System.out.println("After Swapping= " +list);
    }
    
}
