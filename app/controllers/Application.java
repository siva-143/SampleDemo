package controllers;

import models.User;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.submit;

import javax.inject.Inject;

/**
 * Created by CGLenovo01 on 24-04-2017.
 */
public class Application extends Controller{
    private final FormFactory formFactory;
    @Inject
    public Application(FormFactory formFactory)
    {
        this.formFactory=formFactory;
    }
    public Result index(){
        Form<User> userForm=formFactory.form(User.class);
        return ok(views.html.home.render(userForm));
    }
    public Result submit(){
        Form<User> userForm=formFactory.form(User.class);
        Form<User> filledform=userForm.bindFromRequest();
        User created=filledform.get();
        return ok(submit.render(created));
    }
}
