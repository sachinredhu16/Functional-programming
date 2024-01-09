package Question1;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class M_FindOnlyDuplicates {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("AA", "BB", "AA", "CC");

        Set<Map.Entry<String, Long>> collect = names.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().filter(x -> x.getValue() > 1).collect(Collectors.toSet());

        Map<String, Long> collect1 = names.stream().filter(x -> Collections.frequency(names, x) > 1)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(collect1);

    }
}
