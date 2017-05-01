package models;

/**
 * Created by CGLenovo01 on 27-04-2017.
 */
public class Emp{
    private int empno;
    private String ename;
    private int age;
    public Emp(){
        super();
    }
    public Emp(int empno,String ename,int age){
        this.empno=empno;
        this.ename=ename;
        this.age=age;
    }

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
