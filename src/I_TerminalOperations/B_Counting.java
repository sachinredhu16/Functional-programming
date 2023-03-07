package I_TerminalOperations;

import data.StudentDataBase;

import static java.util.stream.Collectors.counting;

public class B_Counting {

    public static long count(){
        return StudentDataBase.getAllStudents().stream()
                .filter((s)->s.getGpa()>=3.9)
                .collect(counting());
    }
    public static void main(String[] args) {
        System.out.println("Counting is : "+count());
    }
}
