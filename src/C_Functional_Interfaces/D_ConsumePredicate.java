package C_Functional_Interfaces;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class D_ConsumePredicate {

    static Predicate<Student> p1 = student -> student.getGradeLevel()>=3;
    static Predicate<Student> p2 = student -> student.getGpa()>=3.9;

    //Bi-predicate
    static BiPredicate<Integer,Double> biPredicate = (gradeLevel,gpa)-> gradeLevel>=3 && gpa>=3.9;
    static BiConsumer<String,List<String>> biConsumer = (name,activities) -> System.out.println(name+" : "+activities);

    static Consumer<Student> consumer = (student)->{
        // using predicate
//        if(p1.and(p2).test(student))
//            biConsumer.accept(student.getName(),student.getActivities());

        // using Bi-predicate
        if(biPredicate.test(student.getGradeLevel(),student.getGpa()))
            biConsumer.accept(student.getName(),student.getActivities());
    };


    public static void filerByGradeLevelAndGPA(){
        List<Student> getAllStudents = StudentDataBase.getAllStudents();
        getAllStudents.forEach(consumer);
    }

    public static void main(String[] args) {
        filerByGradeLevelAndGPA();
    }
}
