package codeSoft5;

public class Student {
    private int ID;
    private String name;
    private int age;
    private double GPA;

    public Student(int ID, String name, int age, double GPA) {
        this.ID = ID;
        this.name = name;
        this.age = age;
        this.GPA = GPA;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

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

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }
}