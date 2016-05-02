package ente;

import java.util.*;
import java.io.*;

/**
 * Created by Torben on 10.04.2016.
 */
public class ArticleManager implements ArticleDAO{

    HashMap<String,Article> articles;


    public ArticleManager(){
        articles = new HashMap<String, Article>();
    }

    public HashMap<String, Article> articleList() {
        return articles;
    }

    public void updateArticle(Article article) {
        //if(articles.containsKey(article.getUrl())) {
            article.setRating(article.getRating());
            article.setUrl(article.getUrl());
            article.setRead(true);
            articles.put(article.getUrl(), article);
        //}
    }


    public void deleteArticle(Article article) {
        articles.remove(articles.get(article.getUrl()));
    }

    public Article getArticle(String url){
        return articles.get(url);
    }
}
