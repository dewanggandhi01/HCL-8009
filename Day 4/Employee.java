public class Employee {
    private String name;
    private int empId;
    private String dept;
    private int salary;
    public Employee(String name, int empId, String dept, int salary){
        this.name = name;
        this.empId = empId;
        this.dept = dept;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", empId=" + empId +
                ", dept='" + dept + '\'' +
                ", salary=" + salary +
                '}';
    }
}
