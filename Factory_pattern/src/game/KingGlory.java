package game;

public class KingGlory {
    public static void main(String[] args) {
        AbstractFactory operationFactory = new OperationFactory();
        operationFactory.oprateLinux().controller();
        operationFactory.oprateWindows().controller();
        System.out.println("===================================");
        AbstractFactory viewFactory  = new ViewFactory();
        viewFactory.oprateLinux().controller();
        viewFactory.oprateWindows().controller();
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }
}
