package C_Functional_Interfaces;

import data.Student;
import data.StudentDataBase;

import java.lang.constant.Constable;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class B_BiConsumer {

    static BiConsumer<String, List<String>> c3 = (name,activities)-> System.out.println(name+" : "+activities);

    static Consumer<Student> c4 = student -> {
        if(student.getGradeLevel()>=3 && student.getGpa()>=3.9)
            System.out.println(student.getName());
    };
    public static void printNameAndActivities(){
        List<Student> getAllStudents = StudentDataBase.getAllStudents();
        getAllStudents.forEach(student -> c3.accept(student.getName(),student.getActivities()));
    }

    public static void printNamesWithConditions(){
        List<Student> getAllStudents = StudentDataBase.getAllStudents();
        getAllStudents.forEach(c4);
    }

    public static void main(String[] args) {
        BiConsumer<String,String> c1 = (a,b)-> System.out.println(a+" "+b);
        c1.accept("Sachin","Redhu");

        // multiplication of two numbers
        BiConsumer<Integer,Integer> c2 = (a,b)-> System.out.println(a*b);
        c2.accept(2,4);

        printNameAndActivities();
        printNamesWithConditions();
    }
}
