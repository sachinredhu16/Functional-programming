package Questions;

import java.util.function.Function;

public class CountOnesInString {

    static Function<String,Integer> func = (s)->{
        int count =0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1')
                count++;
        }
        return count;
    };

    public static void main(String[] args) {
        System.out.println(func.apply("101001"));
    }
}
