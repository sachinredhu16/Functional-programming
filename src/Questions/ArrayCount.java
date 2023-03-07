package Questions;

import java.util.function.BiFunction;
import java.util.function.Function;

public class ArrayCount {

    static BiFunction<int[],Integer,Integer> func = (s,max)->{
      int count  =0;
      for(int i=0;i<s.length;i++){
          count += max/s[i];
      }
      return count;
    };
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(func.apply(arr,3));
    }
}
