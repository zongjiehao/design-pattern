package image;

public class PngReader implements ImageReader {
    public PngReader(){
        System.out.println("创建png读取器");
    }
    @Override
    public void read() {
        System.out.println("读取png文件");
    }
}
