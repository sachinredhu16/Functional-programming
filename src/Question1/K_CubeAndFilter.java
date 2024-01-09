package Question1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class K_CubeAndFilter {
    public static void main(String[] args) {
//        to perform cube on list elements and filter numbers greater than 50
        List<Integer> integerList = Arrays.asList(4,5,6,7,1,2,3);
        List<Integer> collect = integerList.stream().filter(x -> (x * x * x) > 50).collect(Collectors.toList());

        collect.forEach(System.out::println);
    }
}
