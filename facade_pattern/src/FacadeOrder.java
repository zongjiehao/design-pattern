import service.PayService;
import service.ProductService;

public class FacadeOrder {
    private ProductService productService;
    private PayService payService;

    public FacadeOrder() {
        this.productService = new ProductService();
        this.payService = new PayService();
    }
    public void buyPhone(){
        this.productService.pick();
        System.out.println("加入购物车");
        this.payService.pay();
    }
}
