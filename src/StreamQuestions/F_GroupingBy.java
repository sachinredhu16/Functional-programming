package StreamQuestions;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class F_GroupingBy {
    public static void main(String[] args) {
        List<String> list = List.of("Apple","Banana","Cat","Dog");

        Map<Integer, List<String>> collect1 = list.stream().collect(Collectors.groupingBy(String::length));
        Map<Integer, Long> collect2 = list.stream().collect(Collectors.groupingBy(String::length, Collectors.counting()));
        Map<Integer, Long> collect3 = list.stream().collect(Collectors.groupingBy(String::length, HashMap::new, Collectors.counting()));

        System.out.println(collect1);
        System.out.println(collect2);
        System.out.println(collect3);
    }
}
