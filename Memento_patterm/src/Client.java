import whitebox.Caretaker;
import whitebox.Originator;

public class Client {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();
        originator.setState("当头炮");
        System.out.println("当前状态:"+originator.getState());
        caretaker.saveMemento(originator.createMemento());
        System.out.println("存档");

        originator.setState("马来照");
        System.out.println("当前状态:"+originator.getState());

        originator.setState("飞象");
        System.out.println("当前状态:"+originator.getState());
        caretaker.saveMemento(originator.createMemento());

        originator.setState("将军");
        System.out.println("当前状态:"+originator.getState());
        //恢复状态
        originator.restoreMemento(caretaker.retrieveMemento());
        System.out.println("读档");
        System.out.println("恢复后状态："+originator.getState());
    }


}
