package Question1;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class M_RepeatedChar {
    public static void main(String[] args) {
        String s = "codec";
        Set<Character> set = new HashSet<>();

        List<Character> collect = s.chars().mapToObj(x -> Character.toLowerCase((char) x))
                .filter(x -> !set.add(x))
                .collect(Collectors.toList());

        collect.forEach(System.out::println);

    }
}
