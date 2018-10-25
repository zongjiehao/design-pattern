package mi;

public class M5DateLineAdapter implements Target {
    private Target target;
    public M5DateLineAdapter(Target target){
        this.target = target;
    }
    public void connection(){
        System.out.println("插入type-c转换头");
        target.connection();
    }

    public static void main(String[] args) {
        Target target = new M5DateLineAdapter(new M5DateLine());
        target.connection();
    }
    
}
