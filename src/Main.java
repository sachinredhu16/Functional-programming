import java.lang.ref.WeakReference;
import java.util.*;
import java.util.function.IntConsumer;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {
       PriorityQueue<Integer> pq = new PriorityQueue<>();
       pq.add(1);
       pq.add(2);
       pq.add(3);
        System.out.println(pq.remove());
       pq.remove(3);

        System.out.println(pq);

    }
   }