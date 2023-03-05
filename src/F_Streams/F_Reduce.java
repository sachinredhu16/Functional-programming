package F_Streams;

import data.Student;
import data.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class F_Reduce {

    static BinaryOperator<Integer> binary = (a,b)->a*b;

    static BiFunction<Integer,Integer,Integer> func = (a,b)->a*b;

    public static int getMultiply(List<Integer> list){
        return list.stream()
                .reduce(2,binary);
    }
    public static Optional<Integer> getMultiplyWithoutIdentity(List<Integer> list){
        return list.stream()
                .reduce(binary);
    }

    public static Optional<Student> getHighestGpaStudent(){
        return StudentDataBase.getAllStudents().stream()
                .reduce((s1,s2)->{
                    if(s1.getGpa()>s2.getGpa())
                        return s1;
                    return s2;
                });
    }
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        System.out.println("Multiply is : "+getMultiply(list));
        System.out.println("Multiply is : "+getMultiplyWithoutIdentity(list).get());

        // use case
        System.out.println(getHighestGpaStudent().get());
    }
}
