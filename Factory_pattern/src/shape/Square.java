package shape;

public class Square implements Shapes {
    public Square(){
        System.out.println("创建方形模型");
    }
    @Override
    public void draw() {
        System.out.println("画了一个方形模型");
    }
}
