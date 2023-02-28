package C_Functional_Interfaces;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class G_UnaryOperator {

    static UnaryOperator<String> unaryOperator = (s)->s.concat(" Redhu");

    public static void main(String[] args) {

        String unaryString = unaryOperator.apply("Sachin");

        System.out.println(unaryString);

    }
}
