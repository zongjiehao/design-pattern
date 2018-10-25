package lazy;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LazyLoadBalancer {
    private static LazyLoadBalancer lazyLoadBalancer;
    private List<String> servers = null;
    private LazyLoadBalancer(){
        servers = new ArrayList<String>();
    }
    public void addServer(String server){
        servers.add(server);
    }
    public String getServer(){
        Random random = new Random();
        int i = random.nextInt(servers.size());
        return servers.get(i);
    }
    public static LazyLoadBalancer getInstance(){
        // 第一步：假设T1,T2两个线程同时进来且满足 loadBalancer == null
        if (lazyLoadBalancer == null) {
            // 第二步：那么 loadBalancer 即会被实例化2次
            lazyLoadBalancer = new LazyLoadBalancer();
        }
        return lazyLoadBalancer;
    }

    /*public static void main(String[] args) {
        LazyLoadBalancer lazyLoadBalancer1 = LazyLoadBalancer.getInstance();
        LazyLoadBalancer lazyLoadBalancer2 = LazyLoadBalancer.getInstance();
        System.out.println("hashCode:"+lazyLoadBalancer1.hashCode());
        System.out.println("hashCode:"+lazyLoadBalancer2.hashCode());
//        lazyLoadBalancer1.addServer("server1");
//        lazyLoadBalancer2.addServer("server2");
//        IntStream.range(0,5).forEach(i -> System.out.println("转发至："+lazyLoadBalancer1.getServer()));

    }*/
}
