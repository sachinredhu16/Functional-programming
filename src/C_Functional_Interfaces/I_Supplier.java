package C_Functional_Interfaces;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.Supplier;

public class I_Supplier {

    static Supplier<Integer> sup1 = ()->10;

    static Supplier<List<Student>> sup2 = ()-> StudentDataBase.getAllStudents();
    public static void main(String[] args) {
        System.out.println(sup1.get()+10);

        List<Student> getAllStudents = sup2.get();
        getAllStudents.forEach(student -> System.out.println(student));
    }
}
