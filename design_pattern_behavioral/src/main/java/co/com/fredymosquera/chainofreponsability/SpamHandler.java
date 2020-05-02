package co.com.fredymosquera.chainofreponsability;

public class SpamHandler implements Handler {

    private Handler handler;
    public  SpamHandler(){
    }
    public  SpamHandler(Handler handler){
        this.handler = handler;
    }

    public void setHandler(Handler handler) {
        this.handler = handler;
    }

    @Override
    public void handlerRequest(Request request) {
        if(request.getRequestType() == RequestType.SPAM){
            System.out.println("Filtering email in SPAM emails...");
        }else {
            handler.handlerRequest(request);
        }
    }
}
