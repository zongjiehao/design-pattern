public class Client {
    public static void main(String[] args) {
        Employee emp1 = new Developer("员工 - 小李", 10000);
        Employee emp2 = new Developer("员工 - 小王", 15000);
        Employee manager1 = new Manager("经理 - 邱东", 25000);
        manager1.add(emp1);
        manager1.add(emp2);
        Employee emp3 = new Developer("员工 - 小唐", 20000);
        Manager generalManager = new Manager("总经理 - 覃飞", 50000);
        generalManager.add(emp3);
        generalManager.add(manager1);
        generalManager.print();
    }
}
