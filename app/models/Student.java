package models;
import com.avaje.ebean.Model;
import javax.persistence.*;

/**
 * Created by CGLenovo01 on 25-04-2017.
 */
@Entity
public class Student extends Model{
    @Id
    private int sno;
   private int sage;
   private String sname;
    public int getSno() {
        return sno;
    }
    public void setSno(int sno) {
        this.sno = sno;
    }
    public int getSage() {
        return sage;
    }
    public void setSage(int sage) {
        this.sage = sage;
    }
    public String getSname() {
        return sname;
    }
    public void setSname(String sname) {
        this.sname = sname;
    }
    public static Model.Finder<String,Student> find=new Model.Finder<String,Student>(String.class,Student.class);
//    public static List<Student> getAllList(){
//        return Student.find.orderBy("sno").findList();
//    }
}
