package CollectionFramework;
import java.util.*;

public class QueueClass {
    public static void main(String[] args) {
//        Queue<Integer> q=new LinkedList<>();
//        q.offer(1);
//        q.offer(2);
//        q.offer(3);
//        q.offer(4);
//        q.offer(5);
//        System.out.println(q);
//
//        Queue<Integer> q=new ArrayDeque<>();
//        q.add(1);
//        q.add(2);
//        q.add(3);
//        q.add(4);
//        System.out.println(q);
//	
//    	  Deque<Integer> stack = new ArrayDeque<>();
//	      stack.push(10);
//	      stack.push(20);
//	      stack.push(30);
//	      System.out.println("Stack elements: " + stack);
//	      System.out.println("Top element: " + stack.peek());       
//	      stack.pop();
//	      System.out.println("Stack after pop: " + stack);
    	
          PriorityQueue<Integer> pq = new PriorityQueue<>();
          pq.offer(40);
          pq.offer(10);
          pq.offer(30);
          pq.offer(20);
          System.out.println("PriorityQueue elements: " + pq);
          System.out.println("Top element (Peek): " + pq.peek()); 
          while(!pq.isEmpty()) {
              System.out.print(pq.poll() + " ");
          }    	
    	
    }       

}