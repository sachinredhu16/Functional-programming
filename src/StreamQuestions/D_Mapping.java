package StreamQuestions;

import java.util.List;
import java.util.stream.Collectors;

public class D_Mapping {
    public static void main(String[] args) {
        List<String> list = List.of("Apple","Banana","Cat");

        List<Integer> collect = list.stream().collect(Collectors.mapping(x -> x.length(), Collectors.toList()));

//        List<Integer> collect1 = list.stream().map(x -> x.length()).collect(Collectors.toList());
        List<Integer> collect1 = list.stream().map(String::length).collect(Collectors.toList());

        System.out.println(collect);
        System.out.println(collect1);

    }
}
