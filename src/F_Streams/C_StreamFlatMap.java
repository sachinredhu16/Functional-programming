package F_Streams;

import data.Student;
import data.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class C_StreamFlatMap {

    public static List<String> getActivities(){
        List<String> list = StudentDataBase.getAllStudents().stream()
                .map(Student::getActivities)//Stream<List<String>>
                .flatMap(List::stream)//Stream<String>
                .collect(toList());
        return list;
    }

    public static void main(String[] args) {
        System.out.println(getActivities());
    }
}
