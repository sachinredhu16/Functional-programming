import java.util.Arrays;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,6,7,8,9};
        Consumer<Integer> c1 = (n)-> System.out.print(n+" ");
        Arrays.stream(arr).forEach(n->{
            if(n%2==0)
                c1.accept(n);
        });
    }
}