package F_Streams;

import java.util.Arrays;
import java.util.List;

public class I_LimitSkip {

    public static int usingLimit( List<Integer> list, long limit){
        return list.stream()
                .limit(limit)
                .reduce(0,(a,b)->a+b);
    }
    public static int usingSkip( List<Integer> list, long skip){
        return list.stream()
                .skip(skip)
                .reduce(0,(a,b)->a+b);
    }
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6);

        System.out.println("Sum using limit is : "+usingLimit(list,4));

        System.out.println("Sum using limit is : "+usingSkip(list,4));
    }
}
