package ente;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Torben on 10.04.2016.
 */
public interface ArticleDAO {
    HashMap<String,Article> articleList();
    Article getArticle(String url);
    void updateArticle(Article article);
    void deleteArticle(Article article);
}
