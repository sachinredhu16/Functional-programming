package F_Streams;

import data.Student;
import data.StudentDataBase;

import java.util.List;

public class J_Match {

    public static boolean allMatch(){
        List<Student> list = StudentDataBase.getAllStudents();
        System.out.println(list);
        return list.stream()
                .allMatch(s -> s.getGpa()>=5.0);
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
