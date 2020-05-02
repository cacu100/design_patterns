package co.com.fredymosquera.chainofreponsability;

public class PlaringWithChainOfReponsability {

    public static void main(String[] args) {
        Request emailSpam = new Request(RequestType.SPAM);
        FanHandler fanHandler = new FanHandler();
        SpamHandler spamHandler = new SpamHandler();
        fanHandler.setHandler(spamHandler);
        fanHandler.handlerRequest(emailSpam);
    }
}
