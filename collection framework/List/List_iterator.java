package CollectionFrameworks.Lists;
import java.util.*;

public class List_iterator {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("banana");
        fruits.add("papaya");
        fruits.add("orange");
        fruits.add("lemon");
        System.out.println(fruits);
        System.out.println(fruits.size());

        System.out.println("*********using for loop");
        for(int i=0; i<fruits.size(); i++)
        {
            System.out.println("fruits is "+fruits.get(i));
        }

        // for each loop
        System.out.println("*********using for each loop");
        for(String f: fruits)
        {
            System.out.println("fruits : "+f);
        }

        //iterator
        System.out.println("************using iterator");
        Iterator<String> fe =fruits.iterator();
        while (fe.hasNext())
        {
            System.out.println(fe.next());
        }
        System.out.println("************using listiterator");
        Iterator<String> fe1 =fruits.listIterator();
        while (fe1.hasNext())
        {
            System.out.println(fe1.next());
        }

        //Sublist
        List<String> smalllist= fruits.subList(0,2);
        System.out.println("sublist : "+smalllist);

        Stack<String> fruits1 = new Stack<>();
        fruits1.push("10");
        fruits1.push("20");
        fruits1.push("30");
        System.out.println(fruits1);
        System.out.println(fruits1.pop());
        System.out.println(fruits1);

        // its check the which element  top in stack.
        System.out.println(fruits1.peek());

        System.out.println(fruits1.empty());

        System.out.println(fruits1.isEmpty());
    }
}
