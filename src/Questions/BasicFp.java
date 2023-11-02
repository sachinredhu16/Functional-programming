package Questions;

import java.util.ArrayList;
import java.util.List;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BasicFp {
    static IntFunction intConsumer = (a)->a*2;
    public static void main(String[] args) {
        // sum
        int sum = IntStream.range(2,4).sum();
//        System.out.println(sum);

        // unique elements and sorted
        List<Integer> list = List.of(1,2,3,5,6,7,3,2,1,3,5,6,7);
        List<Integer> res = list.stream().distinct().sorted().collect(Collectors.toList());
//        System.out.println(res);

//        System.out.println(intConsumer.apply(10));

        // flatMap
        List<List<Integer>> l1 = new ArrayList<>();
        l1.add(List.of(1,2,3));
        l1.add(List.of(6,7,8));
        l1.add(List.of(11,12,13));

        System.out.println(l1);

        List<Integer> r1 = l1.stream().flatMap(List::stream).collect(Collectors.toList());
        int s = r1.stream().reduce(0,(a,b)->a+b);
        System.out.println(r1 + " : "+s);


    }
}
