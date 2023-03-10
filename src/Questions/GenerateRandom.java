package Questions;

import java.util.function.Supplier;

public class GenerateRandom {

    static Supplier<Integer> getRandomNumber = ()->{
      return (int)((Math.random()*(100-1))+1);
    };

    public static void main(String[] args) {
        System.out.println("Random number is : "+getRandomNumber.get());
    }
}
