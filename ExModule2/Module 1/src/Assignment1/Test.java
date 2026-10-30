package Assignment1;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;

// 1. Employee class adhering to encapsulation principles
class Employee {
    private int empId;
    private String name;
    private String role;
    private BigDecimal basic;
    private BigDecimal hra;
    private BigDecimal ta;
    private BigDecimal specialAllowance;

    public Employee(int empId, String name, String role, double basic, double hra, double ta, double specialAllowance) {
        this.empId = empId;
        this.name = name;
        this.role = role;
        this.basic = BigDecimal.valueOf(basic);
        this.hra = BigDecimal.valueOf(hra);
        this.ta = BigDecimal.valueOf(ta);
        this.specialAllowance = BigDecimal.valueOf(specialAllowance);
    }

    public int getEmpId() { return empId; }
    public String getName() { return name; }
    public String getRole() { return role; }
    public BigDecimal getBasic() { return basic; }
    public BigDecimal getHra() { return hra; }
}

// 2. Separate Bonus Calculator service for low coupling and single responsibility
class BonusCalculator {
    public static BigDecimal calculateBonus(Employee emp) {
        // Total salary calculation components: taking Basic and HRA
        BigDecimal basicAndHra = emp.getBasic().add(emp.getHra());
        
        double percentage = switch (emp.getRole().toLowerCase()) {
            case "manager" -> 0.12;    // 12%
            case "engineer" -> 0.12;   // 12%[cite: 1]
            case "admin" -> 0.10;      // 10%[cite: 1]
            case "accountant" -> 0.08; // 8%[cite: 1]
            default -> 0.0;
        };
        
        return basicAndHra.multiply(BigDecimal.valueOf(percentage)).setScale(0, RoundingMode.HALF_UP);
    }
}

// 3. Main execution class
public class Test {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
            new Employee(100, "Rahul", "Engineer", 40000, 15833, 5000, 10000),
            new Employee(101, "Aman", "Manager", 60000, 20000, 6000, 12000),
            new Employee(102, "Neha", "Admin", 35000, 12000, 4000, 8000),
            new Employee(103, "Pooja", "Accountant", 45000, 15000, 4500, 9000)
        );

        // Process using Java Streams: calculate bonus, sort in descending order, and print[cite: 1]
        employees.stream()
            .map(emp -> new AbstractMap.SimpleEntry<>(emp, BonusCalculator.calculateBonus(emp)))
            .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue())) // Descending sort by bonus
            .forEach(entry -> {
                Employee emp = entry.getKey();
                BigDecimal bonus = entry.getValue();
                
                System.out.println("----------------------------------------");
                System.out.println("Emp_id: " + emp.getEmpId());
                System.out.println("Name: " + emp.getName());
                System.out.println("Bonus: Rs. " + bonus);
            });
        System.out.println("----------------------------------------");
    }
}