package Question1;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class N_CountChar {
    public static void main(String[] args) {
        String s = "string data to count each character";
        String[] split = s.split("");

        Map<Character, Long> collect = s.chars().mapToObj(x -> Character.toLowerCase((char) x))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(collect);

    }
}
