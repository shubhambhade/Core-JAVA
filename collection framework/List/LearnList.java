package CollectionFrameworks.Lists;

import java.util.*;
import java.util.ArrayList;

public class LearnList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.contains(20));
        // it removes element on the basis of index position.
        list.remove(2);
        System.out.println(list);

        // it removes element.
        list.remove(Integer.valueOf(40));
        System.out.println(list);

        List<Integer> list1 = new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(300);
        list.add(400);

        list.addAll(list1);
        System.out.println(list);

        //intersection element removes
        list.removeAll(list1);
        System.out.println(list);
//        list.retainAll(list1);
//        System.out.println(list);

        Object a[] = list.toArray();
        for (Object e : a)
        {
            Integer temp = (Integer) e;
            System.out.print(e+" ");
        }
    }
}
