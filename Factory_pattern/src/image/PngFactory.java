package image;

public class PngFactory implements ImageReaderFactory {

    @Override
    public ImageReader create() {
        System.out.println("实例化png工厂");
        return new PngReader();
    }
}
