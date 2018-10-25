package game;

public class ViewFactory implements AbstractFactory {
    @Override
    public Linux oprateLinux() {
        System.out.println("界面控制linux系统");
        return new LinuxController();
    }

    @Override
    public Windows oprateWindows() {
        System.out.println("界面控制windows系统");
        return new WindowsController();
    }
}
