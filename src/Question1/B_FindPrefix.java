package Question1;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class B_FindPrefix {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,32);

        List<Integer> ans = myList.stream().
                filter(s -> pred.test(String.valueOf(s))).
                collect(Collectors.toList());
        ans.forEach(s-> System.out.print(s+" "));


    }
    public static Predicate<String> pred = (s)->s.charAt(0)=='1';
}
