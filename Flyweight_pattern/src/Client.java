public class Client {
    public static void main(String[] args) {
        Flyweight fw0 = FlyweightFactory.getFlyweight("战士");
        Flyweight fw1 = FlyweightFactory.getFlyweight("战士");
        Flyweight fw2 = FlyweightFactory.getFlyweight("法师");
        Flyweight fw3 = FlyweightFactory.getFlyweight("坦克");
        fw1.operation("瑞文");
        fw1.operation("鳄鱼");
        fw2.operation("光辉");
        fw3.operation("泰坦");
        fw3.operation("盖伦");
        System.out.printf("[结果(对象对比)] - [%s]\n", fw0 == fw1);
        System.out.printf("[结果(内在状态)] - [%s]\n", fw1.getType());
        System.out.printf("一共召唤 %s 种类型英雄\n", FlyweightFactory.total());

    }
}
