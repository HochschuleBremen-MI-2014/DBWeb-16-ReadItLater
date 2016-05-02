package ente;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Torben on 10.04.2016.
 */
public class Main{

    public static void main(String [] args) {
        try {
            Article result = new Article();
            System.out.println("Url pl0x");
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            String input1 = in.readLine();
            result.setUrl(input1);

            System.out.println("Rating pl0x");
            BufferedReader in2 = new BufferedReader(new InputStreamReader(System.in));
            String input2 = in2.readLine();
            result.setRating(input2);
            result.setRead(false);

            System.out.println(result.getUrl()+ result.getRating());

            ArticleManager articleMan = new ArticleManager();

            articleMan.updateArticle(result);
            System.out.println(articleMan.articles.get("blub"));


        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
