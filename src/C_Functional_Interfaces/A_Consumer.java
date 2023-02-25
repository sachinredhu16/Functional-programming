package C_Functional_Interfaces;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;
import java.util.stream.IntStream;

public class A_Consumer {

    static Consumer<Student> c2 = (student)-> System.out.println(student);
    static Consumer<Student> c3 = (student)-> System.out.print(student.getName()+" ");
    static  Consumer<Student> c4 = (student)-> System.out.println(student.getActivities());
    public static void printStudents(){
        List<Student> allStudents = StudentDataBase.getAllStudents();
        allStudents.forEach(c2);
        System.out.println("============");
    }
    public static void printNameAndSudents(){
        List<Student> allStudents = StudentDataBase.getAllStudents();
        allStudents.forEach(c3.andThen(c4)); // this is called consumer chaining
        System.out.println("============");
    }
    public static void printNameAndSudentsUsingCondition(){
        List<Student> allStudents = StudentDataBase.getAllStudents();
        allStudents.forEach(student->{
            if (student.getGradeLevel()>=3 && student.getGpa()>=3.9)
                c3.andThen(c4).accept(student);
        });
        System.out.println("============");
    }

    public static void main(String[] args) {
        Consumer<String> c1 = (n)-> System.out.println(n.toUpperCase());
        c1.accept("sangeet");

        printStudents();
        printNameAndSudents();
        printNameAndSudentsUsingCondition();

    }
}
