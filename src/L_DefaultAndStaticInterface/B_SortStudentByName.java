package L_DefaultAndStaticInterface;

import data.Student;
import data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;


class CustomComparator implements Comparator<Student> {
     // sort the student on the basis of name length
    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getName().length() > o2.getName().length())
            return 1;
        else if (o1.getName().length() < o2.getName().length())
            return -1;
        return 0;


    }
}

public class B_SortStudentByName {

    static Consumer<Student> consumer = (s)-> System.out.println(s);

    static Comparator<Student> sortByName = Comparator.comparing(Student::getName);

    static Comparator<Student> sortByGPA = Comparator.comparingDouble(Student::getGpa);

    static Comparator<Student> nullHandling = Comparator.nullsFirst(sortByName);

    public static void main(String[] args) {
        List<Student> studentList = StudentDataBase.getAllStudents();

        // sort by name length
//        CustomComparator comparator = new CustomComparator();
//        studentList.sort(comparator);

//        studentList.sort(sortByName);

        // if you want to sort using two different property
//        studentList.sort(sortByName.thenComparing(sortByGPA));

        // if collection may contain null value then we have to use nullsFirst or nullsLast to prevent
        // form NullPointerException
        studentList.sort(nullHandling.thenComparing(sortByGPA));

        studentList.forEach(consumer);
    }
}
