package Questions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenOddNumbers {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,5,6,7,8,9,10);

        List<Integer> even = list.stream()
                .filter(s->s%2==0).collect(Collectors.toList());
        even.forEach(s-> System.out.print(s+" "));

        System.out.println();

        List<Integer> odd = list.stream()
                .filter(s->s%2==1).collect(Collectors.toList());
        odd.forEach(s-> System.out.print(s+" "));
        System.out.println();

        Arrays.asList("s","sa","sad","asdf").stream().map(s->s.length()).forEach(s-> System.out.print(s+" "));
    }
}
