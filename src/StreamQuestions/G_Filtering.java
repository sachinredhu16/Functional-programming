package StreamQuestions;

import java.util.List;
import java.util.stream.Collectors;

public class G_Filtering {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5,6,7,8,9,10);

        List<Integer> collect = list.stream().collect(Collectors.filtering(x -> x % 2 == 0, Collectors.toList()));

        System.out.println(collect);
    }
}
