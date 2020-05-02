package co.com.fredymosquera.chainofreponsability;

public class FanHandler implements Handler {

    private Handler handler;
    public FanHandler(){
    }
    public FanHandler(Handler handler){
        this.handler = handler;
    }

    public void setHandler(Handler handler) {
        this.handler = handler;
    }

    @Override
    public void handlerRequest(Request request) {
        if(request.getRequestType() == RequestType.FAN){
            System.out.println("Filtering email to FAN emails...");
        }else {
            handler.handlerRequest(request);
        }
    }
}
