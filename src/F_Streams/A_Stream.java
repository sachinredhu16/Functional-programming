package F_Streams;

import data.Student;
import data.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class A_Stream {

    static Function<List<Student>,HashMap<String, List<String>>> func = (allStudents)->{
        HashMap<String, List<String>> res = new HashMap<>();
        allStudents.forEach(student -> {
            res.put(student.getName(),student.getActivities());
        });
        return res;
    };

    public static void main(String[] args) {

        HashMap<String, List<String>> result = func.apply(StudentDataBase.getAllStudents());
        System.out.println(result);

        // but using streams API
        Map<String, List<String>> map = StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGradeLevel()>=4)
                .collect(Collectors.toMap(Student::getName,Student::getActivities));

        System.out.println(map);
    }
}
