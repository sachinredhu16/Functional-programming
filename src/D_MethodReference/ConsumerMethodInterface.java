package D_MethodReference;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerMethodInterface {

    static Consumer<Student> c1 = System.out::println;
    static Consumer<Student> c2 = Student::printListOfActivities;

    public static void main(String[] args) {
        List<Student> getAllStudents= StudentDataBase.getAllStudents();
        getAllStudents.forEach(c1);

        getAllStudents.forEach(c2);
    }
}
