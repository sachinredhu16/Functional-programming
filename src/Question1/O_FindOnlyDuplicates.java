package Question1;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class O_FindOnlyDuplicates {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5,6,1,2,3);
        Set<Integer> set = new HashSet<>();

        System.out.println("==== using Set =======");
        list.stream().filter(x->!set.add(x)).collect(Collectors.toList()).forEach(System.out::println);

        System.out.println("==== using Map =======");
        list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet()
                .stream().filter(x->x.getValue()>1)
                .map(x->x.getKey())
                .collect(Collectors.toList()).forEach(System.out::println);
    }
}
