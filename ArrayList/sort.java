package ArrayList;

import java.util.*;

public class sort {
    public static void main(String[] args) {
         ArrayList<Integer>list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(50);
        list.add(0);
        list.add(-1);
        System.out.println("Before Sorting = "+list);
        Collections.sort(list);
        System.out.println("After sorting = "+list);
        // For desending order
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Descending Order = "+list);
    }
}
