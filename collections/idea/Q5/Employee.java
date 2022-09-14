package collections.idea.Q5;

public class Employee {
    private int empId;
    private String name;
    private String department;
    private int empSalary;

    public Employee(int empId, String name, String department, int empSalary) {
        this.empId = empId;
        this.name = name;
        this.department = department;
        this.empSalary = empSalary;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(int empSalary) {
        this.empSalary = empSalary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", empSalary=" + empSalary +
                '}';
    }
}
