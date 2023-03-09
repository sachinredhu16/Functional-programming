package I_TerminalOperations;

import data.Student;
import data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class G_MinByMaxBy {

    public static void groupingMaxBy(){
        //optional
        Map<Integer, Optional<Student>> res1 = StudentDataBase.getAllStudents().stream()
                .collect(groupingBy(Student::getGradeLevel,
                        maxBy(Comparator.comparing(Student::getGpa))));
        //optional
        Map<Integer, Student> res2 = StudentDataBase.getAllStudents().stream()
                .collect(groupingBy(Student::getGradeLevel,
                        collectingAndThen(maxBy(Comparator.comparing(Student::getGpa)),Optional::get)));

//        System.out.println(res1);
        System.out.println(res2);

    }
    public static void groupingMinBy(){
        //optional
        Map<Integer, Optional<Student>> res1 = StudentDataBase.getAllStudents().stream()
                .collect(groupingBy(Student::getGradeLevel,
                        minBy(Comparator.comparing(Student::getGpa))));
        //optional
        Map<Integer, Student> res2 = StudentDataBase.getAllStudents().stream()
                .collect(groupingBy(Student::getGradeLevel,
                        collectingAndThen(minBy(Comparator.comparing(Student::getGpa)),Optional::get)));

//        System.out.println(res1);
        System.out.println(res2);

    }


    public static void main(String[] args) {
//        groupingMaxBy();
        groupingMinBy();
    }
}
