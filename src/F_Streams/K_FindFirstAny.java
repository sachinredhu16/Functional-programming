package F_Streams;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.Optional;

public class K_FindFirstAny {

    public static Optional<Student> findFirst(){
        return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGpa()>3)
                .findFirst();
    }
    public static Optional<Student> findAny(){
        return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGpa()>3)
                .findAny();
    }
    public static void main(String[] args) {

        System.out.println("Find First is : "+findFirst().get());
        System.out.println("Find Any is : "+findAny().get());
    }
}
