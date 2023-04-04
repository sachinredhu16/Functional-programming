package F_Streams;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.Predicate;

public class J_Match {

    static Predicate<Student> pred = s -> s.getGradeLevel()>0;
    public static boolean allMatch(){
        List<Student> list = StudentDataBase.getAllStudents();
        System.out.println(list);
        return list.stream()
                .allMatch(pred);
    }
    public static boolean anyMatch(){
        return StudentDataBase.getAllStudents().stream()
                .anyMatch(student -> student.getGpa()>=2);
    }
    public static boolean noneMatch(){
        return StudentDataBase.getAllStudents().stream()
                .noneMatch(student -> student.getGpa()>=3);
    }

    public static void main(String[] args) {
        System.out.println("All match is : "+allMatch());
        System.out.println("Any match is : "+anyMatch());
        System.out.println("None match is : "+noneMatch());
    }
}
