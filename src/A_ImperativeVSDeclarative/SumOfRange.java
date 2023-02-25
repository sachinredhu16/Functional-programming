package A_ImperativeVSDeclarative;

import java.util.stream.IntStream;

public class SumOfRange {
    public static void main(String[] args) {
        System.out.println("================== Imperative ==============");
        int sum1 =0;
        for(int i=1;i<100;i++){
            sum1 +=i;
        }
        System.out.println("Sum using Imperative Approach : "+sum1);

        System.out.println("================== Declarative ==============");
        int sum2 = IntStream.range(1,100).sum();
        System.out.println("Sum using Declarative Approach : "+sum2);
    }
}
