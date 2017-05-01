package models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * Created by CGLenovo01 on 28-04-2017.
 */
public class LoginDao{
    public static boolean validate(String name,String pass){
        boolean status=false;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/sys","root","shiva143");
            PreparedStatement ps=con.prepareStatement("select * from user_details where user_name=? and user_password=?");
            ps.setString(1,name);
            ps.setString(2,pass);
            ResultSet rs=ps.executeQuery();
            status=rs.next();
        }catch(Exception e){System.out.println(e);}
        return status;
    }
}
