package J_ParallelStream;

import javax.swing.*;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class C_ParallelStreamNotUse {

    public static int seqSum(List<Integer> list ){
        long start = System.currentTimeMillis();
        int sum = list.stream()
                .reduce(0,(a,b)->a+b);
        long duration = System.currentTimeMillis()-start;
        System.out.println("Seq streams time is : "+duration);
        return sum;
    }
    public static int parallelSum(List<Integer> list ){
        long start = System.currentTimeMillis();
        int sum = list.stream()
                .parallel()
                .reduce(0,(a,b)->a+b); // perform unboxing from Integer to int
        long duration = System.currentTimeMillis()-start;
        System.out.println("Parallel streams time is : "+duration);
        return sum;
    }


    public static void main(String[] args) {
        List<Integer> list = IntStream.rangeClosed(1,100)
                .boxed()
                .collect(Collectors.toList());
        seqSum(list);
        parallelSum(list);

    }
}
