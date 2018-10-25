public class SpeedWay extends AbstractRoad {

    @Override
    public void run() {
        car.run();
        System.out.println("在高速路上");
    }
}
