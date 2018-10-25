public class Developer implements Employee {
    private String name;
    private double salary;

    public Developer(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public void add(Employee employee) {
        System.out.println("不实现");
    }

    @Override
    public void remove(Employee employee) {
        System.out.println("不实现");
    }

    @Override
    public void print() {
        System.out.println("-------------");
        System.out.print("Name = " + this.name);
        System.out.println("\t\tSalary = " + this.salary);
        System.out.println("-------------");
    }
}
