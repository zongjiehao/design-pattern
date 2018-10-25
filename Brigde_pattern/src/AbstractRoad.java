abstract class AbstractRoad {
    protected Car car;

    public void setCar(Car car) {
        this.car = car;
    }
    public abstract void run();
}
