package ente;

/**
 * Created by Torben on 10.04.2016.
 */
public class Article {

    private String url;
    private boolean read;
    private String rating;

    public Article(){};
    public Article(String url, boolean read, String rating){
        this.url=url;
        this.read=read;
        this.rating=rating;
    }



    public String getUrl() {
        return url;
    }

    public String setUrl(String url) {
        this.url = url;
        return url;
    }

    public boolean isRead() {
        return read;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public void setRead(boolean read) {
        this.read = read;
    }

    public String getRating() {
        return rating;
    }
}
