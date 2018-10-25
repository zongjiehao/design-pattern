public class ChainClient {
    public static void main(String[] args) {
        AbstractHandler handlerA = new HandlerA();
        AbstractHandler handlerB = new HandlerB();
        AbstractHandler handlerC = new HandlerC();
        handlerA.setHandler(handlerB);
        handlerB.setHandler(handlerC);
        handlerB.handlerRequest("B");

    }
}
