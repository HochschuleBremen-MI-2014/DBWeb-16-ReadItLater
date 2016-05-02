/**
 * Created by Torben on 04.04.2016.
 */
public class User{
    private String username;
    private String password;

    public User(String username, String password){
        this.username = username;
        this.password = password;
    }

    public boolean userLogin(String username, String password){
        return false;
    }

    public boolean userRegistration(String username, String password, String firstName, String lastName, String emailAddress){
        return false;
    }

    public String getUsername(){
        return username;
    }

    public String getPassword(){
        return password;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public void setPassword(String password){
        this.password = password;
    }
}