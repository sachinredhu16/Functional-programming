package G_FactoryMethods;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class OfIterateGenerate {

    public static void main(String[] args) {
        // of
        Stream<String> str = Stream.of("A","B","C","D");
        str.forEach(System.out::println);

        // iterate
        Stream.iterate(1,x->x*2)
                .limit(10)
                .forEach(s-> System.out.print(s+" "));

        System.out.println();

        // Generate
        Supplier<Integer> supp = new Random()::nextInt;
        Stream.generate(supp)
                .limit(10)
                .forEach(s-> System.out.print(s+" "));


    }
}
