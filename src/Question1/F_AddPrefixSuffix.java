package Question1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class F_AddPrefixSuffix {
    public static void main(String[] args) {
        List<String> listOfStrings = Arrays.asList("Facebook", "Twitter", "YouTube", "WhatsApp", "LinkedIn");

        String collect = listOfStrings.stream().collect(Collectors.joining("-", "[", "]"));

        System.out.println(collect);
    }
}
