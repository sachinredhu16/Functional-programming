package F_Streams;

import data.Student;
import data.StudentDataBase;

public class G_MapFilterReduce {
    public static int getSumOfNotebooks(){
        return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGender().equalsIgnoreCase("male"))
                .map(Student::getNoteBooks)
                .filter(a->a>20)
                .reduce(0,(a,b)->a+b);

    }

    public static void main(String[] args) {
        System.out.println("Total books is : "+ getSumOfNotebooks());
    }
}
