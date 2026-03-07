public class StudentIntro {
    private String name;
    private int age,roll;

    public StudentIntro() {}

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public int getRoll() { return roll; }
    public void setRoll(int roll) { this.roll = roll; }
    
    public void printInfo() {
        System.out.println(name + " - " + age);
    }
}
