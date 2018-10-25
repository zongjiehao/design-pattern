public class Street extends AbstractRoad{

    @Override
    public void run() {
        car.run();
        System.out.println("在普通街道上");
    }
}
