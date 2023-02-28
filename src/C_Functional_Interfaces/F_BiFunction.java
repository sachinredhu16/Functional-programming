package C_Functional_Interfaces;

import data.Student;
import data.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class F_BiFunction {

    static Predicate<Student> predicate = (student -> student.getGradeLevel()>=4);

    static BiFunction<List<Student>, Predicate<Student>, Map<String,Integer>> biFunction = (getAllStudents,predicate)->{
      Map<String,Integer> map = new HashMap<>();
      getAllStudents.forEach((student -> {
          if(predicate.test(student))
              map.put(student.getName(),student.getGradeLevel());
      }));
      return map;
    };

    public static void getNameAndGrade(){
        List<Student> getAllStudents= StudentDataBase.getAllStudents();
        System.out.println(biFunction.apply(getAllStudents,predicate));
    }

    public static void main(String[] args) {
        getNameAndGrade();
    }
}
