package Z_Serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationEmployeeImpl {
    public static void main(String[] args) throws IOException {
        Employee employee = new Employee("Sachin","7206530162");

        FileOutputStream fileOutputStream = new FileOutputStream("D:\\first.ser");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeObject(employee);
        objectOutputStream.close();
        fileOutputStream.close();
    }
}
