import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.IntConsumer;


public class Main {
    static int fun(){
        int i=0;
        return ++i;
    }
    public static void main(String[] args) {
        int[] nums = {1 ,3, 4 ,1 ,2, 3 ,1 };
        Map<Integer,Integer> map = new HashMap<>();
        for(int i:nums){
            System.out.print(i+" ");
            map.put(i,map.getOrDefault(map.get(i),0)+1);
        }

    }
   }