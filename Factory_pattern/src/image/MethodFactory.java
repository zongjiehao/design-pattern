package image;


public class MethodFactory {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        ImageReaderFactory png = new PngFactory();
        ImageReader pngReader = png.create();
        pngReader.read();

        ImageReaderFactory jpg = new JpgFactory();
        ImageReader jpgReader = jpg.create();
        jpgReader.read();
        long end = System.currentTimeMillis();
        System.out.println("总共花了"+(end-start)+"ms的时间");
    }
}
