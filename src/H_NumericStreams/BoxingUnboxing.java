package H_NumericStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BoxingUnboxing {

    public static List<Integer> boxing(){
        return IntStream.rangeClosed(1,10)
                .boxed()
                .collect(Collectors.toList());
    }
    public static int unBoxing(List<Integer> list){
         return list.stream()
                 .mapToInt(Integer::intValue)
                 .sum();

    }


    public static void main(String[] args) {
        System.out.println("Integer value is : "+boxing());

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        System.out.println("intValue sum is : "+unBoxing(list));
    }
}
