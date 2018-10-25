import java.util.ArrayList;
import java.util.List;

public class Manager implements Employee {
    private String name;
    private double salary;

    public Manager(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    public List<Employee> employees = new ArrayList<>();
    @Override
    public void add(Employee employee) {
        employees.add(employee);
    }

    @Override
    public void remove(Employee employee) {
        employees.remove(employee);
    }

    @Override
    public void print() {
        System.out.println("-------------");
        System.out.print("Name = " + this.name);
        System.out.println("\t\tSalary = " + this.salary);
        System.out.println("-------------");
        for (Employee employee : employees) {
            employee.print();
        }
    }
}
