package CollectionFrameworks.Queue;
import java.util.Queue;
import java.util.ArrayDeque;
public class Queue_2 {
    public static void main(String[] args) {
        //deque is used to sliding windows problems.
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        dq.offer(00);
        dq.offer(5);
        dq.offerFirst(10);
        dq.offerFirst(20);
        dq.offerFirst(30);
        dq.offerFirst(40);
        dq.offerLast(50);
        dq.offerLast(60);
        System.out.println(dq);
        System.out.println(dq.pollFirst());
        System.out.println(dq);
        System.out.println(dq.pollLast());
        System.out.println(dq);
        System.out.println(dq.poll());
        System.out.println(dq);

        ArrayDeque<Integer> stack = new ArrayDeque<>();
        // implement stack using ArrayDequeue
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
    }
}
