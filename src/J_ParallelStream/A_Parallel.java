package J_ParallelStream;

import java.util.function.Supplier;
import java.util.stream.IntStream;

public class A_Parallel {

    public static long checkPerformance(Supplier<Integer> supplier, int times){
        long start = System.currentTimeMillis();
        for (int i=0;i<times;i++) {
            supplier.get();
        }
        long end = System.currentTimeMillis();
        return end-start;
    }
    public static int seqStream(){
        return IntStream.rangeClosed(1,10000)
                .sum();
    }
    public static int parallelStream(){
        return IntStream.rangeClosed(1,10000)
                .parallel()
                .sum();
    }

    public static void main(String[] args) {
        System.out.println("Available processor : "+ Runtime.getRuntime().availableProcessors());

        System.out.println("Sequential time diff is : "+checkPerformance(A_Parallel::seqStream,20));
        System.out.println("Parallel time diff is : "+checkPerformance(A_Parallel::parallelStream,20));

//      In parallel processing multiple threads are created and
//      no of threads == availableProcessors in machine

    }
}
