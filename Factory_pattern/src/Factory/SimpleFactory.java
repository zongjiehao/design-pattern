package Factory;

import shape.Circle;
import shape.Shapes;
import shape.Square;

public class SimpleFactory {
    private final static String CIRCLE = "CIRCLE";
    private final static String SQUARE = "SQUARE";

    public static Shapes getFactory(String shape){
        switch (shape){
            case CIRCLE:
                return new Circle();
            case SQUARE:
                return new Square();
            default:
                throw new NullPointerException("未描绘任何图形");
        }
    }

    public static void main(String[] args) {
        Shapes circle = SimpleFactory.getFactory("CIRCLE");
        circle.draw();
        Shapes square = SimpleFactory.getFactory("SQUARE");
        square.draw();
        Shapes ff = SimpleFactory.getFactory("FF");
        ff.draw();
    }
}
