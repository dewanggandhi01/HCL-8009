import java.util.Deque;
import java.util.LinkedList;

public class DequeueImp {
    public static void main(String[] args) {
        Deque<Integer> dq = new LinkedList<>();
        dq.offerFirst(1);
        dq.offerLast(2);
        dq.offerFirst(3);
        dq.offerLast(4);
        System.out.println(dq);
        System.out.println(dq.pollFirst());
        System.out.println(dq.pollLast());
        System.out.println(dq);

    }
}
