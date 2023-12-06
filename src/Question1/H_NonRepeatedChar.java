package Question1;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class H_NonRepeatedChar {
    public static void main(String[] args) {
        String input = "Java articles are Awesome";

        Character character = input.chars()
                .mapToObj(s -> Character.toLowerCase((char) s))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(s -> s.getValue() == 1)
                .map(s -> s.getKey())
                .findFirst()
                .get();

        System.out.println(character);


    }
}
