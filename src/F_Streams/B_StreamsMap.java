package F_Streams;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;

public class B_StreamsMap {

    public static List<String> nameList(){
        List<String> list = StudentDataBase.getAllStudents().stream()// stream student
                // take Student input and give list of string in output
                .map(Student::getName) //Stream String
                .map(String::toUpperCase) //Stream String
                .distinct()               // it uses to make all element unique
                .sorted()                 // this will sort it in natural order
                .collect(toList());
        return list;
    }
    public static Set<String> nameSet(){
        Set<String> set = StudentDataBase.getAllStudents().stream()// stream student
                // take Student input and give list of string in output
                .map(Student::getName) //Stream String
                .map(String::toUpperCase) //Stream String
                .collect(toSet());
        return set;
    }
    public static long getActivitiesCount(){
        long count = StudentDataBase.getAllStudents().stream()
                .map(Student::getActivities)
                .count();
        return count;
    }
    public static void main(String[] args) {
        System.out.println("List is : "+nameList());
        System.out.println("Set is : "+nameSet());
        System.out.println("Count is : "+getActivitiesCount());
    }
}
