package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Results;

/**
 * Created by CGLenovo01 on 21-04-2017.
 */
public class UtitlityController extends Controller {
    public Result util(){
        return GO_HOME;
    };
    public Result GO_HOME = Results.redirect(
            routes.UtitlityController.serviceUtil("Welcome")
    );
    public Result serviceUtil(String name){
        return ok(views.html.util.render(name));
    }
}
