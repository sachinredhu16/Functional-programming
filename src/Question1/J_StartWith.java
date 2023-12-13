package Question1;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class J_StartWith {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("sachin","sangeet","redhu","shubham");
        String startWith = "sa";
        Optional<String> ans = list.stream().filter(s -> s.startsWith(startWith)).findFirst();

        if(ans.isPresent())
            System.out.println("Answer is : "+ans.get());
        else
            System.out.println("Not Found !");
    }

}
