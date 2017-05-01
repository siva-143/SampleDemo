package models;

import com.avaje.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by CGLenovo01 on 21-04-2017.
 */
@Entity
public class Person extends Model{
@Id
    public int id;
    public String name;
}
