package K_Optional;

import java.util.Optional;

public class B_OfEmptyNullable {

    public static Optional<String> ofNullable(){
//        Optional<String> obj = Optional.ofNullable("Hello");
        Optional<String> obj = Optional.ofNullable(null);
        return obj;
    }

    public static Optional<String> of(){
        Optional<String> obj = Optional.of("Hello");
//        Optional<String> obj = Optional.of(null);
        return obj;
    }

    public static Optional<String> empty(){
        return Optional.empty();
    }

    public static void main(String[] args) {
        // if you have always a valid string then use Optional.of() but in case
        // if you want to handle null value as well then go with Optional.ofNullable()

        System.out.println(ofNullable().isPresent()?ofNullable().get():"No data Found !");

        System.out.println(of().get());

        System.out.println(empty());
    }
}
