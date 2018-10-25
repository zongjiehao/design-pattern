import Static.RealSubject;
import Static.Subject;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class SubjectHandler implements InvocationHandler {
    private Subject subject;

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("向代理服务器发出请求");
        if(subject == null){
            subject = new RealSubject();
        }
        subject.request();
        System.out.println("代理服务器响应请求");
        return null;
    }
    public static Subject createProxy(){
        return (Subject) Proxy.newProxyInstance(
                ClassLoader.getSystemClassLoader(),new Class[]{Subject.class},new SubjectHandler()
        );
    }
}
