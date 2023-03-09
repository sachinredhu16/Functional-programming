package K_Optional;

import java.util.Optional;

public class D_OptionalPresentEx {

    public static void main(String[] args) {
        Optional<String> stringOptional = Optional.ofNullable("Hello Optional");
        Optional<String> stringOptionalNull = Optional.ofNullable(null);

        System.out.println(stringOptional.isPresent());
        System.out.println(stringOptionalNull.isPresent());

        stringOptional.ifPresent((s -> System.out.println("value is : " + s)));
        stringOptionalNull.ifPresent((s -> System.out.println("value is : " + s)));
    }
}
