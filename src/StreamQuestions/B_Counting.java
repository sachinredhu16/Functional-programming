package StreamQuestions;

import java.util.List;
import java.util.stream.Collectors;

public class B_Counting {
    public static void main(String[] args) {
        List<String> list = List.of("Apple","Banana","Cat");

        Long collect = list.stream().collect(Collectors.counting());

        System.out.println(collect);
    }
}
