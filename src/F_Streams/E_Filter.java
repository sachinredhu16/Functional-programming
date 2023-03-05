package F_Streams;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class E_Filter {

    public static List<Student> getStudents(){
        return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getName().equalsIgnoreCase("female"))
                .collect(Collectors.toList());
    }
    public static void main(String[] args) {
        getStudents().forEach(System.out::println);
    }
}
