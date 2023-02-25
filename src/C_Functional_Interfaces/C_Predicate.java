package C_Functional_Interfaces;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.Predicate;

public class C_Predicate {
    static  Predicate<Integer> p1 = n-> n%2==0;
    static  Predicate<Integer> p2 = n-> n%5==0;

    static Predicate<Student> p3 = student -> student.getGradeLevel()>=3;
    static Predicate<Student> p4 = student -> student.getGpa()>=3.9;

    public static void predicateAnd(){
       boolean b = p1.and(p2).test(10);
        System.out.println("Predicate AND is : "+b);
    }
    public static void predicateOr(){
       boolean b = p1.or(p2).test(8);
        System.out.println("Predicate OR is : "+b);
    }
    public static void predicateNegate(){
        boolean b = p1.and(p2).negate().test(10);
        System.out.println("Predicate NEGATE is : "+b);
    }
    public static void filterStudentByGradeLevel(){
        List<Student> getAllStudents = StudentDataBase.getAllStudents();
        getAllStudents.forEach(student -> {
            if(p3.and(p4).test(student))
                System.out.println(student);
        });
    }

    public static void main(String[] args) {

        System.out.println(p1.test(11));

        predicateAnd();
        predicateOr();
        predicateNegate();
        filterStudentByGradeLevel();

    }
}
