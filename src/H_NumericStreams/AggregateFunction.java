package H_NumericStreams;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class AggregateFunction {

    public static void main(String[] args) {
        int sum = IntStream.rangeClosed(1,10).sum();
        System.out.println("Sum is : "+sum);

        OptionalInt max = IntStream.rangeClosed(1,10).max();
        System.out.println("Max is : "+ max.getAsInt());

        OptionalInt min = IntStream.rangeClosed(1,10).min();
        System.out.println("Min is : "+ min.getAsInt());

        OptionalDouble avg = IntStream.rangeClosed(1,10).average();
        System.out.println("Avg is : "+ avg.getAsDouble());
    }
}
