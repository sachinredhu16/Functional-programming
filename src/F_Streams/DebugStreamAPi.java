package F_Streams;

import data.Student;
import data.StudentDataBase;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DebugStreamAPi {
    public static void main(String[] args) {
        // we can debug the stream using peek operation
        // stream pick one element and do all intermediate operation on it and then pick next .

        Map<String, List<String>> map = StudentDataBase.getAllStudents().stream()
                .peek(student -> System.out.println(student))
                .filter(student -> student.getGradeLevel()>=4)
                .peek(student -> System.out.println(student))
                .collect(Collectors.toMap(Student::getName,Student::getActivities));
    }
}
