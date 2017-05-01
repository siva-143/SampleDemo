package controllers;

import play.mvc.Controller;
import play.mvc.Result;

/**
 * Created by CGLenovo01 on 21-04-2017.
 */
public class UserController extends Controller{
    public Result user(){
        return ok(views.html.submit.render());
    }
}
