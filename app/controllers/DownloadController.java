package controllers;

import play.mvc.Controller;
import play.mvc.Result;

import java.io.File;

/**
 * Created by CGLenovo01 on 26-04-2017.
 */
public class DownloadController extends Controller{
    public Result index(){
        return ok(views.html.common.render());
    }
    public Result download(String name){
        response().setHeader("Content-type","application/x-download");
        response().setHeader("Content-disposition","attachment;filename="+name.substring(name.lastIndexOf('/')+1));
        return ok(new File(name));
    }
}
