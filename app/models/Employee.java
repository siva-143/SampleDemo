package models;
import com.avaje.ebean.Model;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by CGLenovo01 on 26-04-2017.
 */
@Entity
public class Employee{
    public static Model.Finder<Integer,Employee> find=new Model.Finder<>(Employee.class);
    @Id
private Integer empno;
private String ename;
private int age;

    public int getEmpno() {
        return empno;
    }

    public void setEmpno(int empno) {
        this.empno = empno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
