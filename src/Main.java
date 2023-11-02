import java.lang.ref.WeakReference;
import java.util.*;
import java.util.function.IntConsumer;
import java.util.stream.Collectors;


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
        List<String> words = new ArrayList<>();
        words.add("one.two.three");
        words.add("four.five");
        words.add("six");
        List<String> ans = new ArrayList<>();
        for(int i=0;i<words.size();i++){
            String[] arr = words.get(i).split("\\.");
            for(String s :arr){
                ans.add(s);
                System.out.println(s);
            }
        }

    }
   }