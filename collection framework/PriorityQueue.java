package CollectionFrameworks.Queue;
import java.util.*;
public class PriorityQueue {
    public static void main(String[] args) {
        //PriorityQueue is used mean heap concept.
        Queue<Integer> pq = new java.util.PriorityQueue<>();
        pq.add(20);
        pq.add(30);
        pq.add(10);
        pq.add(40);
        System.out.println(pq);
        pq.poll();
        System.out.println(pq);
    }

}
