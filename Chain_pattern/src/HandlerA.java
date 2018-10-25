public class HandlerA extends AbstractHandler {
    @Override
    public void handlerRequest(String condition) {
        if (condition.equals('A')){
            System.out.println("HandlerA处理");
        }else {
            System.out.println("HandlerA不处理,由其他的Handler处理");
            super.getHandler().handlerRequest(condition);
        }
    }
}
