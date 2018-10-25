package shape;

public class Circle implements Shapes {
    public Circle(){
        System.out.println("创建圆形模型");
    }
    @Override
    public void draw() {
        System.out.println("画了一个圆形");
    }
}
