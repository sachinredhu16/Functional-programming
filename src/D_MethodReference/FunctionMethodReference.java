package D_MethodReference;

import java.util.function.Function;

public class FunctionMethodReference {

    static Function<String,String> func = (s)->s.toUpperCase();
    static Function<String,String> func1 = String::toUpperCase;
    public static void main(String[] args) {

        System.out.println(func.apply("sachin"));
        System.out.println(func1.apply("sachin"));
    }
}
