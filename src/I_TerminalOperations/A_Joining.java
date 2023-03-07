package I_TerminalOperations;

import data.Student;
import data.StudentDataBase;

import java.util.stream.Collectors;

import static java.util.stream.Collectors.joining;

public class A_Joining {

    public static String joining1(){
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getName)
                .collect(joining());
    }
    public static String joining2(){
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getName)
                .collect(joining(" "));
    }
    public static String joining3(){
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getName)
                .collect(joining(" ","( "," )"));
    }
    public static void main(String[] args) {
        System.out.println("Joining 1 : "+joining1());
        System.out.println("Joining 2 : "+joining2());
        System.out.println("Joining 3 : "+joining3());
    }
}
