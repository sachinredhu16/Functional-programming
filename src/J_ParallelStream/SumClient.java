package J_ParallelStream;

import java.util.stream.IntStream;

public class SumClient {

    public static void main(String[] args) {
        Sum sum = new Sum();
        IntStream.rangeClosed(1,1000)
                .parallel()
                .forEach(sum::doAdd);


//      when you are performing an operation on mutable object
//      1. always use seq. it will give you correct result
//      2. Don't use parallel it will give you diff in all execution


        System.out.println(sum.getTotal());
    }
}
