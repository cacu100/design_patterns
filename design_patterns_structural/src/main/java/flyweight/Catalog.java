package flyweight;

import java.util.HashMap;
import java.util.Map;

public class Catalog {
    private Map<String, Article> cache = new HashMap<>();

    public  Article getArticleCached(String key){
        if(!cache.containsKey(key)){
            setArticleCache(key);
        }
        return cache.get(key);

    }

    public void setArticleCache(String key) {
        cache.put(key, ConsultaArticleMock(key));
    }

    private Article ConsultaArticleMock(String key){
        Article article = new Article(key, 1000);
        return article;
    }

    public Map<String, Article> getCache() {
        return cache;
    }
}
