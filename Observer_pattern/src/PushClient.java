import com.get.ConcreteObserver;
import com.get.ConcreteSubject;
import com.get.Subject;

public class PushClient {
    public static void main(String[] args) {
/*        *//**
         * 推模型的特点是：目标对象知道观察它的观察者，并提供注册和删除观察者的接口
         *//*
        ConcreteObserver observer = new ConcreteObserver();
        Subject subject = new ConcreteSubject();
        subject.attach(observer);
        subject.notifyObservers("温度变高了");*/
        ConcreteObserver observer = new ConcreteObserver();
        ConcreteSubject subject = new ConcreteSubject();
        subject.attach(observer);
        subject.change("温度变低了");

    }
}
