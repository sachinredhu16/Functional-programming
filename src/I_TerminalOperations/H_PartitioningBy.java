package I_TerminalOperations;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;

import static java.util.stream.Collectors.partitioningBy;
import static java.util.stream.Collectors.toSet;

public class H_PartitioningBy {

    public static void partitioningBy1(){
        Predicate<Student> predGpa = (s)->s.getGpa()>=3.8;
        Map<Boolean, List<Student>> res = StudentDataBase.getAllStudents().stream()
                .collect(partitioningBy(predGpa));

        System.out.println(res);
    }
    public static void partitioningBy2(){
        Predicate<Student> predGpa = (s)->s.getGpa()>=3.8;
        Map<Boolean, Set<Student>> res = StudentDataBase.getAllStudents().stream()
                .collect(partitioningBy(predGpa,
                        toSet()));

        System.out.println(res);
    }

    public static void main(String[] args) {
        partitioningBy1();
        partitioningBy2();
    }
}
