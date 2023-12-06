package Question1;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class D_CountFrequency {
    public static void main(String[] args) {
        String inputString = "Java Concept Of The Day";
        Map<String,Integer> map = new HashMap<>();

        Map<Character, Long> collect = inputString.chars().mapToObj(c -> (char) c).
                collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(collect);
    }
}
