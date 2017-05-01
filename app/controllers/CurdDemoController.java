package controllers;

        import models.Employee;
        import play.mvc.Controller;
        import play.mvc.Result;

        import java.util.List;

/**
 * Created by CGLenovo01 on 26-04-2017.
 */
public class CurdDemoController extends Controller{
    public Result getAll(){
        List<Employee> list=Employee.find.orderBy("empno").findList();
        return ok(views.html.curd.render(list));
    }
    /*public Result getById(int id){
        Employee list=Employee.find.byId(id);
        return ok(views.html.curd.render(views.html.index.render(list)));
    }*/
}
