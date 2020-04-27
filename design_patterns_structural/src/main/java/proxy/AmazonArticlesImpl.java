package proxy;

import java.util.HashMap;
import java.util.Map;

public class AmazonArticlesImpl implements AmazonArticleServices {

    @Override
    public Map<String, String> getArtciles() {
        Map<String,String> articles = new HashMap<>();
        articles.put("s20", "1200");
        articles.put("iphone11", "5000");
        articles.put("p30", "800");
        articles.put("mate30", "900");
        articles.put("note8", "1200");
        articles.put("lenovo", "11200");

        return articles;
    }
}
