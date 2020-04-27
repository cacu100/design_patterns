package flyweight;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    public static void main(String[] args) {
        List<Article> carrito = new ArrayList<>();

        Catalog catalog = new Catalog();
        Article article =  catalog.getArticleCached("s20");
        carrito.add(article);
        carrito.add(article);

        System.out.println(catalog.getCache().size());
        carrito.forEach(System.out::println);


    }
}
