package image;

public class JpgFactory implements ImageReaderFactory {

    @Override
    public ImageReader create() {
        System.out.println("实例化jpg工厂");
        return new PngReader();
    }
}
