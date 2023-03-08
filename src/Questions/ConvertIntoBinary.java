package Questions;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

public class ConvertIntoBinary {

    static BiFunction<Integer,Integer,String> func = (n,base)->{
        String s ="";
        while (n>0){
            s = (n%base)+s;
            n /=2;
        }
        return s;
    };

    static Predicate<String> checkPalindrome = (s)->{
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j))
                return false;
            i++;j--;
        }
        return true;
    };

    public static void main(String[] args) {
        String binary = func.apply(9,2);
        System.out.println(binary);

        System.out.println(checkPalindrome.test(binary));
    }
}
