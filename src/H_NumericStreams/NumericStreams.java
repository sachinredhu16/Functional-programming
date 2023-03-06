package H_NumericStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class NumericStreams {

    public static int sumOfNumbers(List<Integer> list){
        return list.stream()
                .reduce(0,(a,b)->a+b); // extra work of unboxing (Integer to int)
    }
    public static int sumIntStream(){
        return IntStream.rangeClosed(1,6)
                .sum();
    }
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6);
        System.out.println("Sum is : "+sumOfNumbers(list));
        System.out.println("Sum is : "+sumIntStream());
    }
}
