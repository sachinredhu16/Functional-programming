package C_Functional_Interfaces;

import data.Student;
import data.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class E_Function {
    static Function<String,String> func1 = (name)->name.toUpperCase();
    static Function<String,String> func2 = (name)->name+" REDHU";

    static Function<List<Student>, Map<String,Integer>> func3 = (getAllStudents)->{
        Map<String,Integer> map = new HashMap<>();
        getAllStudents.forEach(student -> map.put(student.getName(), student.getGradeLevel()));
        return map;
    };

    public static void getNameAndGrade(){
        List<Student> getAllStudents = StudentDataBase.getAllStudents();
        Map<String,Integer> map = func3.apply(getAllStudents);
        System.out.println(map);
    }

    public static void main(String[] args) {
        System.out.println(func1.andThen(func2).apply("sachin"));

        getNameAndGrade();
    }
}
