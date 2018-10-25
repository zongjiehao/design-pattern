import Static.ProxySubject;
import Static.Subject;

public class Client {
    public static void main(String[] args) {
//        Subject subject = new ProxySubject();
//        subject.request();
        Subject proxy = SubjectHandler.createProxy();
        proxy.request();

    }
}
