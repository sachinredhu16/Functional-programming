package Question1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class A_EvenNumbers {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,32);

        List<Integer> ans = myList.stream().
                filter(x -> x % 2==0).
                collect(Collectors.toList());

        System.out.println("Even numbers are : "+ans);

    }
}
