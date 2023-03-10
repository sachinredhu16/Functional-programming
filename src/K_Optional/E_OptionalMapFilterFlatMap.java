package K_Optional;

import data.Bike;
import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.Optional;

public class E_OptionalMapFilterFlatMap {
    // filter
    public static void filter(){
        Optional<Student> optional = Optional.ofNullable(StudentDataBase.studentSupplier.get());

        optional.filter((s)->s.getGpa()>=3.5)
                .ifPresent(System.out::println);
    }
    // Map
    public static void map(){
        Optional<Student> optional = Optional.ofNullable(StudentDataBase.studentSupplier.get());

        Optional<String> name = optional.map(Student::getName);

        System.out.println("Name is : "+name.get());
    }
    // FlatMap
    public static void flatMap(){
        Optional<Student> optional = Optional.ofNullable(StudentDataBase.getOptionalStudent().get());

        Optional<String> bikeName = optional
                .filter(student -> student.getGpa()>=3.5)// Optional<Student Optional<Bike>>
                .flatMap(Student::getBike) //Optinal<Bike>
                .map(Bike::getName); // Bike name
        System.out.println(bikeName.get());


    }

    public static void main(String[] args) {
        filter();
        map();
        flatMap();
    }
}
