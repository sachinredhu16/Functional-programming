package N_ComparatorExample;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        ComparatorImpl comp = new ComparatorImpl();

        list.add(new Student(1,10,"Sachin",new Address(103,"Sector 11","Jind")));
        list.add(new Student(2,20,"Sangeet",new Address(102,"Sector 11","Jind")));
        list.add(new Student(3,30,"Yogesh",new Address(101,"Sector 11","Jind")));

        List<Student> collect = (List<Student>) list.stream().sorted(comp).map(x -> (Student) x).collect(Collectors.toList());

        List<Student> collect1 = (List<Student>) list.stream().sorted((a,b)->(b.address.flatNo-a.address.flatNo)).map(x -> (Student) x).collect(Collectors.toList());

        collect.forEach(System.out::println);

    }
}
