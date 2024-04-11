package Question1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class J_SortEmployeSalryDesc {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee("Sachin",500000l));
        list.add(new Employee("Yogesh",200000l));
        list.add(new Employee("Mukesh",800000l));
        list.add(new Employee("Sangeet",100000l));

        list.stream().sorted((a,b)->(int)(b.getSalary()- a.getSalary())).skip(1).limit(3).collect(Collectors.toList())
                .forEach(System.out::println);
    }
}
