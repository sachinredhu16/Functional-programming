package N_ComparatorExample;

public class Student implements Comparable<Student> {
    public int id ;
    public int age ;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", address=" + address +
                '}';
    }

    public String name ;
    public Address address;

    public Student(int id, int age, String name, Address address) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.address = address;
    }

    @Override
    public int compareTo(Student o) {
        System.out.println(o.id+"====="+this.id);
        return o.id-this.id;
    }
}
