package D_MethodReference;

import data.Student;
import data.StudentDataBase;

import java.util.function.Predicate;

public class RefactorMethodReference {

    static Predicate<Student> pred = RefactorMethodReference::getStudentByGradeLevel;
    
    public static boolean getStudentByGradeLevel(Student student){
        return student.getGradeLevel()>=2;
    }

    public static void main(String[] args) {

        boolean res = pred.test(StudentDataBase.studentSupplier.get());
        System.out.println(res);
    }
}
