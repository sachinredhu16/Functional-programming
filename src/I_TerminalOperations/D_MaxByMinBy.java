package I_TerminalOperations;

import data.Student;
import data.StudentDataBase;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class D_MaxByMinBy {

    public static Optional<Student> max(){
//        return list.stream()
//                .collect(Collectors.maxBy(Integer::compareTo));
        return StudentDataBase.getAllStudents().stream()
                .collect(Collectors.maxBy(Comparator.comparing(Student::getGpa)));
    }
    public static Optional<Student> min(){

        return StudentDataBase.getAllStudents().stream()
                .collect(Collectors.minBy(Comparator.comparing(Student::getGpa)));
    }

    //without using terminina
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);
        Optional<Integer> max = list.stream().max(Comparator.comparing(Integer::intValue));
        System.out.println(max.get());


        System.out.println("Max is : "+max().get());
        System.out.println("Min is : "+min().get());
    }
}
