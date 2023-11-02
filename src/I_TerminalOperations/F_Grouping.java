package I_TerminalOperations;

import data.Student;
import data.StudentDataBase;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.*;

public class F_Grouping {

    public static Map<String, List<Student>> groupingByGender(){
        return StudentDataBase.getAllStudents().stream()
                .collect(groupingBy(Student::getGender));
    }
    public static Map<String, List<Student>> customizedGroupingByGPA(){
        return StudentDataBase.getAllStudents().stream()
                .collect(groupingBy(s->s.getGpa()>=3.8?"OUTSTANDING":"AVERAGE"));
    }
    public static void twoLevelGrouping1(){
        Map<Integer,Map<String,  List<Student>>> group = StudentDataBase.getAllStudents().stream()
                .collect(groupingBy(Student::getGradeLevel,
                        groupingBy(s->s.getGpa()>=3.8?"OUTSTANDING":"AVERAGE")));

        System.out.println(group);
    }
    public static void twoLevelGrouping2(){
        Map<Integer,Integer> group = StudentDataBase.getAllStudents().stream()
                .collect(groupingBy(Student::getGradeLevel,
                        summingInt(Student::getNoteBooks)));

        System.out.println(group);
    }

    public static void threeLevelGrouping(){
        Map<String, Set<Student>> map =StudentDataBase.getAllStudents().stream()
                .collect(groupingBy(Student::getName, LinkedHashMap::new,toSet()));

        System.out.println(map);
    }
    public static void main(String[] args) {

        System.out.println("GroupBy Gender is : "+groupingByGender());
        System.out.println("GroupBy GPA is : "+customizedGroupingByGPA());

        twoLevelGrouping1();
        twoLevelGrouping2();
        threeLevelGrouping();

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        Map<String,List<Integer>> map = list.stream()
                .collect(groupingBy(a->a%2==0?"Divisible by 2":"Not divisible by 2"));
        System.out.println(map);

    }
}
