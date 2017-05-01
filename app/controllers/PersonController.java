package controllers;

import models.Person;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;

/**
 * Created by CGLenovo01 on 21-04-2017.
 */
public class PersonController extends Controller{
    public Result person(){
        return ok(views.html.person.render("Person Details Page.....................!"));
    }
    public Result addPerson(){
        Person person= Form.form(Person.class).bindFromRequest().get();
        person.save();
        return redirect(routes.PersonController.person());
    }
}
