public class Employee {
    private String employeeName;
    private int department = 1;
    private double salary = 100_000;
    private static int idCount = 0;
    private int id;

    public Employee(String employeeName, int department, double salary) {
        this.employeeName = employeeName;
        this.department = department;
        this.salary = salary;
        this.id = idCount;
        idCount++;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public int getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


}
