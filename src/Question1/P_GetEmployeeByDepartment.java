package Question1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class P_GetEmployeeByDepartment {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(1,"A","CSE"));
        list.add(new Student(2,"B","CSE"));
        list.add(new Student(3,"C","IT"));
        list.add(new Student(4,"D","IT"));
        list.add(new Student(5,"E","CSE"));
        list.add(new Student(6,"F","CSE"));
        list.add(new Student(7,"I","EC"));
        list.add(new Student(8,"G","AI"));
        list.add(new Student(9,"H","CSE"));
        list.add(new Student(10,"J","MI"));

        Map<String, Long> collect = list.stream().collect(Collectors.groupingBy(Student::getDepartment,Collectors.counting()));

        int[] arr = {1,2,3,4,5};
        Arrays.stream(arr).boxed().forEach(System.out::print);

        System.out.println(collect);
    }
}
