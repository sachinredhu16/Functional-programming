package E_ConstructorReference;

import data.Student;

import java.util.function.Function;
import java.util.function.Supplier;

public class ConstructorReference {

    static Supplier<Student> supplier = Student::new;

    static Function<String ,Student> func = Student::new;

    public static void main(String[] args) {
//        Student st = Student::new; this is not valid because it is allowed only for functional interface
        Student student = supplier.get();
        System.out.println(student);

        System.out.println(func.apply("Sachin"));
    }
}
