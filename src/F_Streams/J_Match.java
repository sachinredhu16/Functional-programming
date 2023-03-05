package F_Streams;

import data.StudentDataBase;

public class J_Match {

    public static boolean allMatch(){
        return StudentDataBase.getAllStudents().stream()
                .allMatch(student -> student.getGpa()>=4);
    }
    public static boolean anyMatch(){
        return StudentDataBase.getAllStudents().stream()
                .anyMatch(student -> student.getGpa()>=4);
    }
    public static boolean noneMatch(){
        return StudentDataBase.getAllStudents().stream()
                .noneMatch(student -> student.getGpa()>=5);
    }

    public static void main(String[] args) {
        System.out.println("All match is : "+allMatch());
        System.out.println("Any match is : "+anyMatch());
        System.out.println("None match is : "+anyMatch());
    }
}
