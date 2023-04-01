package B_Lamdbas;

import java.util.function.Function;

public class RestrictionLambdas {

    public static void main(String[] args) {
        int x =10;
        Function<Integer,Integer> func = (s)->{
//            x =100; // inside lambdas body x to be treated as final so value can't be changed
            return s+10;
        };
    }
}
