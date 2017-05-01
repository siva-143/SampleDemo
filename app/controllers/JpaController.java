package controllers;
import models.Film_Text;
import play.db.jpa.JPAApi;
import play.db.jpa.Transactional;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

/**
 * Created by CGLenovo01 on 25-04-2017.
 */
public class JpaController extends Controller {
//    private final JPAApi jpaapi;
//    @Inject
//    public JpaController(JPAApi jpaapi){
//    this.jpaapi=jpaapi;}
//    @Transactional
//    public Result operate(){
//        EntityManager entity=jpaapi.em();
//        Query query=entity.createNativeQuery("select * from film_text",Film_Text.class);
//        List<Film_Text> list=query.getResultList();
//        return ok("This tables contains information about table Film_Text"+ Json.toJson(list));
//    }
}
