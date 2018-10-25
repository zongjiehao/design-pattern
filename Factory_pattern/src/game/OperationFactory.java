package game;

public class OperationFactory implements AbstractFactory {
    @Override
    public Linux oprateLinux() {
        System.out.println("操作linux系统");
        return new LinuxController();
    }

    @Override
    public Windows oprateWindows() {
        System.out.println("操作window系统");
        return  new WindowsController();
    }
}
