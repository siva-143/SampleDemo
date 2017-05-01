package controllers;

import models.Student;
import play.db.Database;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

import javax.inject.Inject;
import java.sql.Connection;
import java.util.List;

/**
 * Created by CGLenovo01 on 24-04-2017.
 */
public class JdbcController extends Controller {
    Database db;

    @Inject
    public JdbcController(Database db) {
        this.db = db;
    }
    public Result conn(){
        Connection conn=db.getConnection();
        if(conn==null){
            return ok("failed");
        }
        else{
            return ok("sucess");
        }
    }
//    public Result findall(){
//        List<Student> students=Student.getAllList();
//        return ok(views.html.show.render(students));
//    }
}
