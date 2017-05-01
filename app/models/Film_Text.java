package models;
import com.avaje.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
/**
 * Created by CGLenovo01 on 28-04-2017.
 */
@Entity
public class Film_Text extends Model {
@Id
    public int film_id;
    public String title;
    public String description;
}
