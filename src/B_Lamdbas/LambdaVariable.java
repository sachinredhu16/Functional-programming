package B_Lamdbas;

import java.util.function.Consumer;
import java.util.function.Function;

public class LambdaVariable {

    public static void main(String[] args) {
        int num =0;
        /*
        Lambdas have some restrictions on using local variables:
        1. Not allowed to use the same the local variable name as
            lambda parameters or inside the lambda body.
        2. Not allowed re-assign a value to a local variable
        */
        Consumer<Integer> consumer =(num1)->System.out.println(num1);

        // No restrictions on instance variables.
    }
}
