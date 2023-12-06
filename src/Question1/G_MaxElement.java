package Question1;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class G_MaxElement {
    public static void main(String[] args) {

        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        Optional<Integer> max = myList.stream().max(Integer::compare);

        System.out.println(max.get());

    }
}
