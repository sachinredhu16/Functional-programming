package StreamQuestions;

import java.util.List;
import java.util.stream.Collectors;

public class E_Joining {
    public static void main(String[] args) {
        List<String> list = List.of("Apple","Banana","Cat");

        String collect1 = list.stream().collect(Collectors.joining());
        String collect2 = list.stream().collect(Collectors.joining(","));
        String collect3 = list.stream().collect(Collectors.joining(",","[","]"));

        System.out.println(collect1);
        System.out.println(collect2);
        System.out.println(collect3);
    }
}
