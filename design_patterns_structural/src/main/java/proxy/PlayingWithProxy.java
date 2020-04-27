package proxy;

public class PlayingWithProxy {

    public static void main(String[] args) {

       // AmazonArticleServices aws = new AmazonArticlesImpl();
        AmazonArticleServices aws = (AmazonArticleServices) ServiceProxy.getInstanceProxy(new AmazonArticlesImpl());

        AliExpressServices ali = (AliExpressServices) ServiceProxy.getInstanceProxy(new AliExpress());

        System.out.println("Articles: ");
        System.out.println(aws.getArtciles());

        System.out.println(ali.getArtciles());
    }
}
