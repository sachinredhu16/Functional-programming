package Questions;

import java.util.function.Predicate;

public class CountVowels {
    public static void main(String[] args) {
        String s = "abcdefghijklmnopqrstuvxyzaaa";

        long count = s.chars().mapToObj(x -> (char) x).filter(x -> checkVowels.test(x)).count();
        System.out.println(count);
    }
    private static Predicate<Character> checkVowels = s->(s=='a'||s=='e'||s=='i'||s=='o'||s=='u');
}
