package controllers;

        import controllers.*;
        import play.mvc.Controller;
        import play.mvc.Result;

/**
 * Created by CGLenovo01 on 21-04-2017.
 */
public class DemoController extends Controller {
    public Result demo(String message){
        return ok(views.html.demo.render(message));
    }
    public Result demoDup(){
        return redirect(controllers.routes.DemoController.demo("PPLayFramework 2.5X...................."));
}
}
