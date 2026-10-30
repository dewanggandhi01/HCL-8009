package CollectionFramework;
import java.util.*;

class Student implements Comparable<Student>{
    String name;
    int rollNumber;
    int age;
    double marks;

    public Student(String name, int rollNumber, int age, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.age = age;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Roll: " + rollNumber + ", Name: " + name + ", Age: " + age + ", Marks: " + marks;
    }
    
    @Override
    public int compareTo(Student o) {
        return Integer.compare(this.rollNumber, o.rollNumber);
    }
}

class MyComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.name.compareTo(s2.name);
    }
}
public class Students {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Aarav", 101, 20, 85.5));
        students.add(new Student("Vidiut", 102, 19, 92.0));
        students.add(new Student("Sumit", 103, 21, 78.5));
        students.add(new Student("Ved", 104, 18, 95.0));
        students.add(new Student("Atharv", 105, 22, 68.0));
        students.add(new Student("Abeer", 106, 20, 88.5));
        students.add(new Student("Amit", 107, 19, 91.0));
        students.add(new Student("Rohan", 108, 23, 74.0));
        students.add(new Student("Priya", 109, 21, 83.5));
        students.add(new Student("Neha", 110, 18, 96.5));

        System.out.println("All Students List");
        for (Student s : students) {
            System.out.println(s);
        }

        students.sort(Comparator.comparingInt(s -> s.age));
        System.out.println("\nSorted by Age");
        for (Student s : students) {
            System.out.println(s);
        }

        students.sort((s1, s2) -> Double.compare(s2.marks, s1.marks));
        System.out.println("\nSorted by Marks");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
