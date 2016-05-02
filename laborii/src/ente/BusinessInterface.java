/**
 * Created by Torben on 04.04.2016.
 */

import java.io.Serializable;
import java.io.Externalizable;
import java.util.Date;

public interface BusinessInterface {

   // boolean userLogin(String username, String password);
   // boolean userRegistration(String username, String password, String firstName, String lastName, String emailAddress);
    boolean updateArticle(String url, boolean read, int rating);
}
