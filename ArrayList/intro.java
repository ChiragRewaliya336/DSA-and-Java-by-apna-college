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

        // Multi-Dimensional list:
        ArrayList<ArrayList<Integer>>mainList = new ArrayList<>();
        ArrayList<Integer>list3 =new ArrayList<>();
        list3.add(1); list3.add(2);
        mainList.add(list3);

        ArrayList<Integer>list2 =new ArrayList<>();
        list2.add(1); list2.add(2);
        mainList.add(list2);
        System.out.println(mainList);
        for(int i=0; i<mainList.size(); i++){
            ArrayList<Integer>currlist= mainList.get(i);
            for(int j=0; j<currlist.size(); j++){
                System.out.print(currlist.get(j)+" ");
            }
            System.out.println();
        }

    }
}
