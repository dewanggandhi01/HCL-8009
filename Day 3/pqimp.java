import java.util.PriorityQueue;

public class pqimp {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(14);
        pq.offer(2);
        pq.offer(1);
        pq.offer(5434);
        pq.offer(5);
        System.out.println(pq);
        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }
}
