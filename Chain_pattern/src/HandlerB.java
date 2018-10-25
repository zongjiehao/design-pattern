public class HandlerB extends AbstractHandler {
    @Override
    public void handlerRequest(String condition) {
        if (condition.equals('B')){
            System.out.println("HandlerB处理");
        }else {
            System.out.println("HandlerB不处理,由其他的Handler处理");
            super.getHandler().handlerRequest(condition);
        }
    }
}
