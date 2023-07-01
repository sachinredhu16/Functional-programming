import java.lang.ref.WeakReference;
import java.util.*;
import java.util.function.IntConsumer;


public class Main {
    public static boolean isSubSequence(String a , String b){
        int i=0;
        while(i<a.length()){
            if(b.indexOf(a.charAt(i))>=0){
                i++;
                b = b.substring(1);
            }
            else
                break;
        }
        return i==a.length();
    }
    public static void main(String[] args) {
        String s =  "sachin";
        String ch ="son";
        System.out.println(isSubSequence(ch,s));

    }
   }