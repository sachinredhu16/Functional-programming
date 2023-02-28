import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int[] res = Arrays.stream(arr)
                .filter(x->x%2==0)
                .toArray();
        for(int x:res)
            System.out.print(x+" ");
    }
}