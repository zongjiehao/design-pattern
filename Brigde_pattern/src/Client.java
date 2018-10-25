import sun.security.x509.AVA;

public class Client {
    public static void main(String[] args) {
        Car smallCar = new SmallCar();
        Car bigCar = new BigCar();
        AbstractRoad road = new SpeedWay();
        road.setCar(smallCar);
        road.run();
        road.setCar(bigCar);
        road.run();

        AbstractRoad road1 = new Street();
        road1.setCar(smallCar);
        road1.run();
        road1.setCar(bigCar);
        road1.run();

    }
}
