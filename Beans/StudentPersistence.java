import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable {

    private String name;
    private int age;

    public Student() {}   

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
}

public class StudentPersistence {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        Student s = new Student();
        s.setName("Alice");
        s.setAge(22);

        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("student.ser"));

        out.writeObject(s);
        out.close();

        ObjectInputStream in = new ObjectInputStream(new FileInputStream("student.ser"));

        Student s1 = (Student) in.readObject();
        in.close();

        System.out.println(s1.getName() + " " + s1.getAge());
    }
}