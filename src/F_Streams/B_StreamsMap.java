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
                .collect(toList());
        return list;
    }
    public static Set<String> nameSet(){
        Set<String> list = StudentDataBase.getAllStudents().stream()// stream student
                // take Student input and give list of string in output
                .map(Student::getName) //Stream String
                .map(String::toUpperCase) //Stream String
                .collect(toSet());
        return list;
    }
    public static void main(String[] args) {
        System.out.println(nameList());
        System.out.println(nameSet());
    }
}
