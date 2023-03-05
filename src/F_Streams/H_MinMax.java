package F_Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class H_MinMax {

    public static Optional<Integer> findMax(List<Integer> list){
        return list.stream()
                .reduce((a,b)-> a>b ? a: b);
    }
    public static Optional<Integer> findMin(List<Integer> list){
        return list.stream()
                .reduce((a,b)-> a>b ? b: a);
    }
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1);

        Optional<Integer> maxValue = findMax(list);
        if (maxValue.isPresent())
            System.out.println("Max number is : "+maxValue.get());
        else
            System.out.println("List is empty !");

        Optional<Integer> minValue = findMin(list);
        if(minValue.isPresent())
            System.out.println("Min number is : "+minValue.get());
        else
            System.out.println("List is empty !");



    }
}
