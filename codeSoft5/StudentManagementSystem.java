package codeSoft5;

import java.util.ArrayList;

public class StudentManagementSystem {
    private ArrayList<Student> students;

    public StudentManagementSystem() {
        students = new ArrayList<Student>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void deleteStudent(int ID) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getID() == ID) {
                students.remove(i);
                break;
            }
        }
    }

    public void displayStudents() {
        for (Student student : students) {
            System.out.println(student.getID() + " " + student.getName() + " " + student.getAge() + " " + student.getGPA());
        }
    }

    public Student searchStudent(int ID) {
        for (Student student : students) {
            if (student.getID() == ID) {
                return student;
            }
        }
        return null;
    }

    public void updateStudent(int ID, Student student) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getID() == ID) {
                students.set(i, student);
                break;
            }
        }
    }
}