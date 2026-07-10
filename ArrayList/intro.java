package ArrayList;

import java.util.*;

public class intro {
    public static void main(String[] args) {
        // Java Collection Framework:
        ArrayList<Integer> list = new ArrayList<>();
        // Operation:

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        // get element:for accessing the element:
        int elem = list.get(2);
        System.out.println(list);
        System.out.println("This is contain 5:" + list.contains(5));
        System.out.println("Before remove and update.");
        // remove:
        System.out.println(list);
        list.remove(3);
        // set element at index:
        list.set(3, 6);
        // Contain element :
        System.out.println("This is contain 0:" + list.contains(0));
        System.out.println("This is contain 0:" + list.contains(5));
        System.out.println(elem);
        System.out.println(list);

        // another add:
        list.add(1, 9);
        System.out.println(list);

        // size of arraylist:
        System.out.println(list.size());
    }
}
