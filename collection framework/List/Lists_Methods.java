package CollectionFrameworks.Lists;
import java.util.*;
public class Lists_Methods {
    public static void main(String[] args) {
       List<Integer> l = new ArrayList<>();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        l.add(50);
        System.out.println(l);
        System.out.println(l.get(0));
        l.set(1 ,200);
        System.out.println(l);
        l.add(2 , 300);
        System.out.println(l);
        l.remove(1);
        System.out.println(l);

        // we can check the element is present which position.
        System.out.println(l.lastIndexOf(10));

        System.out.println(l.lastIndexOf(50));
    }
}
