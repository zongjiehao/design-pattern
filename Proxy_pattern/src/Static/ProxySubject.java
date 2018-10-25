package Static;

public class ProxySubject implements Subject {
    private Subject realSubject;
    @Override
    public void request() {
        System.out.println("向代理服务器发出请求");
        if (realSubject == null){
            realSubject = new RealSubject();
        }
        realSubject.request();
        System.out.println("代理服务器响应请求");
    }
}
