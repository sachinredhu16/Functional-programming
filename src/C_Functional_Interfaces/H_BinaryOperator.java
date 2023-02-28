package C_Functional_Interfaces;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class H_BinaryOperator {

    static BinaryOperator<String> b1 = (s1, s2)->s1.concat(s2);
    static BinaryOperator<Integer> b2 = (a,b)->a*b;

    static Comparator<Integer> comparator = (a,b)->a.compareTo(b);
    public static void main(String[] args) {

        String binaryString = b1.apply("Sachin"," Redhu");
        System.out.println(binaryString);

        int num = b2.apply(3,4);
        System.out.println(num);

        BinaryOperator<Integer> maxBy = BinaryOperator.maxBy(comparator);
        System.out.println("Max is : "+maxBy.apply(10,20));

        BinaryOperator<Integer> minBy = BinaryOperator.minBy(comparator);
        System.out.println("Min is : "+minBy.apply(10,20));
    }
}
