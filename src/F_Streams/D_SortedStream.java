package F_Streams;

import data.Student;
import data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class D_SortedStream {

    public static List<Student> sortedByName(){
        List<Student> list = StudentDataBase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getName))
                .collect(Collectors.toList());
        return list;
    }
    public static List<Student> sortedBygpa(){
        List<Student> list = StudentDataBase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getGpa))
                .collect(Collectors.toList());
        return list;
    }
    public static List<Student> sortedByGpaReverse(){
        List<Student> list = StudentDataBase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getGpa).reversed())
                .collect(Collectors.toList());
        return list;
    }

    public static void main(String[] args) {
        System.out.println(sortedByName());
        System.out.println("Student sorted by GPA");
        sortedBygpa().forEach(System.out::println);

        System.out.println("Student sorted by GPA Desc");
        sortedByGpaReverse().forEach(System.out::println);
    }
}
