package customizer;

import java.io.Serializable;

public class StudentBean implements Serializable {

    private String name = "Default";
    private int age = 18;

    public StudentBean() { }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}