package models;
import com.avaje.ebean.Model;
import play.data.validation.Constraints;
import javax.persistence.Entity;

/**
 * Created by CGLenovo01 on 24-04-2017.
 */
@Entity
public class User extends Model{
    @Constraints.Required
    private String username;
    @Constraints.Required
    public String password;
    public static Finder<String,User> find = new Finder<String,User>(User.class);
}
