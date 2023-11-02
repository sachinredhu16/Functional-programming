package Question1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class C_findDuplicates {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        Set<Integer> set = new HashSet<>();

        List<Integer> ans = myList.stream().
                filter(n -> !set.add(n)).
                collect(Collectors.toList());
        ans.forEach(s-> System.out.print(s+" "));


    }
}
