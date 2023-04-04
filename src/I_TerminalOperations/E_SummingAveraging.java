package I_TerminalOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class E_SummingAveraging {

    public static int sumOfList(List<Integer> list){
        return list.stream()
                .collect(Collectors.summingInt(Integer::intValue));
    }
    public static double avgOfList(List<Integer> list){
        return  list.stream()
                .collect(Collectors.averagingInt(Integer::intValue));
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4);
        int sum = list.stream().reduce(0,(a,b)->a+b);
        System.out.println("Sum is : "+sum);

        System.out.println("Sum is : "+sumOfList(list));
        System.out.println("Avg is : "+avgOfList(list));

    }
}
