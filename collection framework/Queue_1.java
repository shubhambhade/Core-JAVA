package CollectionFrameworks.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_1 {
    public static void main(String[] args) {
        Queue <Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        // offer same as to add
        q.offer(50);
        q.offer(60);
        q.offer(70);
        q.offer(80);

//        // while loop
//        while (!q.isEmpty()){
//            System.out.println(q.poll());
//        }
        System.out.println(q);
        System.out.println(q.poll());
        System.out.println(q);
        System.out.println(q.peek());
        System.out.println(q);

    }
}
