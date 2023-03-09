package J_ParallelStream;

import data.Student;
import data.StudentDataBase;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class B_ParallelStreamsEx {

    public static List<String> seqGetActivities(){
        long start = System.currentTimeMillis();
        List<String> list = StudentDataBase.getAllStudents().stream()
                .map(Student::getActivities)//Stream<List<String>>
                .flatMap(List::stream)//Stream<String>
                .collect(toList());
        long end = System.currentTimeMillis();
        System.out.println("Seq time is : "+(end-start));
        return list;
    }

    public static List<String> parallelGetActivities(){
        long start = System.currentTimeMillis();
        List<String> list = StudentDataBase.getAllStudents().stream()
                .parallel()
                .map(Student::getActivities)//Stream<List<String>>
                .flatMap(List::stream)//Stream<String>
                .collect(toList());
        long end = System.currentTimeMillis();
        System.out.println("Parallel time is : "+(end-start));
        return list;
    }

    public static void main(String[] args) {
        seqGetActivities();
        parallelGetActivities();
    }
}
