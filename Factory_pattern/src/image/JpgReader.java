package image;

public class JpgReader implements ImageReader {
    public JpgReader(){
        System.out.println("创建jpg读取器");
    }
    @Override
    public void read() {
        System.out.println("读取jpg文件");
    }
}
