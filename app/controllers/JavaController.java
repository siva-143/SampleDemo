package controllers;
import models.Customers;
import models.Emp;
import play.mvc.Controller;
import play.mvc.Result;

import javax.servlet.RequestDispatcher;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by CGLenovo01 on 27-04-2017.
 */
public class JavaController extends Controller{
public static Connection getConn() throws SQLException,ClassNotFoundException{
    Connection conn=null;
    try {
        Class.forName("com.mysql.jdbc.Driver");
        conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila","root","shiva143");
    }catch (Exception e){
        System.out.println("Exception is raised in the following context"+" "+e);
    }
    return conn;
}
public static List<Customers> getList(){
    List<Customers> list=new ArrayList<>();
    try{
        Connection conn=JavaController.getConn();
        PreparedStatement stmt=conn.prepareStatement("select *from customer");
        ResultSet rs=stmt.executeQuery();
        while (rs.next()){
            Customers cust=new Customers();
            cust.setCustomer_id(rs.getInt(1));
            cust.setStore_id(rs.getInt(2));
            cust.setFirst_name(rs.getString(3));
            cust.setLast_name(rs.getString(4));
            cust.setEmail(rs.getString(5));
            cust.setAddress_id(rs.getInt(6));
            cust.setActive(rs.getInt(7));
            cust.setCreate_date(rs.getDate(8));
            cust.setLast_update(rs.getDate(9));
            list.add(cust);
        }
    }catch (Exception e){System.out.println(e.getStackTrace());}
    return list;
}
public Result getResult(){
    List<Customers> list=JavaController.getList();
    return ok(views.html.usage.render(list));
}
}
