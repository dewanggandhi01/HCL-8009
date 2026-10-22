import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student {
    String name;
    int roll;
    int marks;
    int age;
    public Student(String name, int roll, int marks, int age) {
        this.name = name;
        this.roll = roll;
        this.marks = marks;
        this.age = age;
    }
    void print() {
        System.out.println("name: " + name);
        System.out.println("roll: " + roll);
        System.out.println("marks: " + marks);
        System.out.println("age: " + age);


    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("A", 1, 10, 54));
        students.add(new Student("B", 2, 100,34));
        students.add(new Student("C", 3, 43,34));
        students.add(new Student("D", 4, 45,54));
        students.add(new Student("E", 5, 34,12));
        students.add(new Student("F", 6, 45,23));
        students.add(new Student("G", 7, 46,23));
        students.add(new Student("H", 8, 76,32));
        students.add(new Student("I", 9, 45,12));
        students.add(new Student("J", 10, 46,45));

        Collections.sort(students, (a, b) -> {
            if (a.age !=  b.age) {
                return a.age - b.age;
            }
            return b.marks - a.marks;
        });
        for  (Student student : students) {
            student.print();
            System.out.println();
        }
    }
}
