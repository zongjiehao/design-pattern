public abstract class AbstractHandler {
    private AbstractHandler handler;
    public abstract void handlerRequest(String condition);

    public AbstractHandler getHandler() {
        return handler;
    }

    public void setHandler(AbstractHandler handler) {
        this.handler = handler;
    }
}
