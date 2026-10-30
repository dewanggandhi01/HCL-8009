import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;
import java.util.List;
public class Assignment1 {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Shivansh", 101, "IT", 90000));
        employees.add(new Employee("Vishal", 102, "IT", 80000));
        employees.add(new Employee("Satyam", 103, "IT", 60000));
        employees.add(new Employee("Shivam", 105, "HR", 50000));
        for (Employee e : employees) {
            System.out.println(e.toString());
        }
        System.out.println();
        Collections.sort(employees, (a, b) -> a.getSalary() - b.getSalary());
        ListIterator<Employee> it = employees.listIterator();
        while(it.hasNext()){
            System.out.println(it.next().toString());
        }
        System.out.println();
        while(it.hasPrevious()){
            System.out.println(it.previous().toString());
        }

    }
}
