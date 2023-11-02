package I_TerminalOperations;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class C_Mapping {

    public static void main(String[] args) {
        List<String> list = StudentDataBase.getAllStudents().stream()
                .collect(Collectors.mapping(Student::getName,toList()));

        System.out.println("List is : "+list);

        Set<String> set = StudentDataBase.getAllStudents().stream()
                .collect(mapping(Student::getName,toSet()));
        System.out.println("using mapping  is : "+set);

        Set<String> set1 = StudentDataBase.getAllStudents().stream()
                .map(Student::getName)
                .collect(Collectors.toSet());
        System.out.println("using map  is : "+set1);

        Set<String> usingMap = StudentDataBase.getAllStudents().stream()
                        .map(Student::getName)
                                .collect(toSet());
        System.out.println("usingMap is : "+usingMap);



    }
}
