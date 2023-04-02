package Questions;

import java.util.function.Function;

/* A substring of s is considered balanced if all zeroes are before ones
and the number of zeroes is equal to the number of ones inside the substring. */
public class BalancedString {

    static Function<String,Boolean> func = (s)->{
        if(s.length()%2==1)
            return false;
        int zeros=0; boolean zerosB= false;
        int ones =0; boolean onesB= false;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0' && zerosB)
                return false;
            if(s.charAt(i)=='0')
                zeros++;
            if(s.charAt(i)=='1') {
                ones++;
                zerosB=true;
            }
        }
        return zeros==ones;
    };

    public static void main(String[] args) {
        String s = "0101";
        System.out.println(s.substring(0,4));
        System.out.println(func.apply(s));
    }
}
