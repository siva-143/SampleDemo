
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/CGLenovo01/Downloads/play-java/play-java-final-demo/conf/routes
// @DATE:Mon May 01 15:04:03 IST 2017

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  UserController_7: controllers.UserController,
  // @LINE:7
  AsynchronousController_2: controllers.AsynchronousController,
  // @LINE:8
  JavaController_3: controllers.JavaController,
  // @LINE:9
  DownloadController_8: controllers.DownloadController,
  // @LINE:11
  CurdDemoController_0: controllers.CurdDemoController,
  // @LINE:13
  DemoController_5: controllers.DemoController,
  // @LINE:15
  PersonController_1: controllers.PersonController,
  // @LINE:18
  UtitlityController_6: controllers.UtitlityController,
  // @LINE:21
  Application_10: controllers.Application,
  // @LINE:22
  JdbcController_4: controllers.JdbcController,
  // @LINE:25
  Assets_9: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    UserController_7: controllers.UserController,
    // @LINE:7
    AsynchronousController_2: controllers.AsynchronousController,
    // @LINE:8
    JavaController_3: controllers.JavaController,
    // @LINE:9
    DownloadController_8: controllers.DownloadController,
    // @LINE:11
    CurdDemoController_0: controllers.CurdDemoController,
    // @LINE:13
    DemoController_5: controllers.DemoController,
    // @LINE:15
    PersonController_1: controllers.PersonController,
    // @LINE:18
    UtitlityController_6: controllers.UtitlityController,
    // @LINE:21
    Application_10: controllers.Application,
    // @LINE:22
    JdbcController_4: controllers.JdbcController,
    // @LINE:25
    Assets_9: controllers.Assets
  ) = this(errorHandler, UserController_7, AsynchronousController_2, JavaController_3, DownloadController_8, CurdDemoController_0, DemoController_5, PersonController_1, UtitlityController_6, Application_10, JdbcController_4, Assets_9, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, UserController_7, AsynchronousController_2, JavaController_3, DownloadController_8, CurdDemoController_0, DemoController_5, PersonController_1, UtitlityController_6, Application_10, JdbcController_4, Assets_9, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user""", """controllers.UserController.user()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """asyn""", """controllers.AsynchronousController.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getresult""", """controllers.JavaController.getResult()"""),
    ("""GET""", this.prefix, """controllers.DownloadController.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """download/""" + "$" + """name<.+>""", """controllers.DownloadController.download(name:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getall""", """controllers.CurdDemoController.getAll()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """demo/""" + "$" + """message<[^/]+>""", """controllers.DemoController.demo(message:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """person""", """controllers.PersonController.person"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addperson""", """controllers.PersonController.addPerson"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """dup""", """controllers.DemoController.demoDup"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """util""", """controllers.UtitlityController.util()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """util""" + "$" + """name<[^/]+>""", """controllers.UtitlityController.serviceUtil(name:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """submit""", """controllers.Application.submit()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """conn""", """controllers.JdbcController.conn()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_UserController_user0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user")))
  )
  private[this] lazy val controllers_UserController_user0_invoker = createInvoker(
    UserController_7.user(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "user",
      Nil,
      "GET",
      """ An example controller showing a sample home page""",
      this.prefix + """user"""
    )
  )

  // @LINE:7
  private[this] lazy val controllers_AsynchronousController_index1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("asyn")))
  )
  private[this] lazy val controllers_AsynchronousController_index1_invoker = createInvoker(
    AsynchronousController_2.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AsynchronousController",
      "index",
      Nil,
      "GET",
      """""",
      this.prefix + """asyn"""
    )
  )

  // @LINE:8
  private[this] lazy val controllers_JavaController_getResult2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getresult")))
  )
  private[this] lazy val controllers_JavaController_getResult2_invoker = createInvoker(
    JavaController_3.getResult(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.JavaController",
      "getResult",
      Nil,
      "GET",
      """""",
      this.prefix + """getresult"""
    )
  )

  // @LINE:9
  private[this] lazy val controllers_DownloadController_index3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_DownloadController_index3_invoker = createInvoker(
    DownloadController_8.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DownloadController",
      "index",
      Nil,
      "GET",
      """""",
      this.prefix + """"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_DownloadController_download4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("download/"), DynamicPart("name", """.+""",false)))
  )
  private[this] lazy val controllers_DownloadController_download4_invoker = createInvoker(
    DownloadController_8.download(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DownloadController",
      "download",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """download/""" + "$" + """name<.+>"""
    )
  )

  // @LINE:11
  private[this] lazy val controllers_CurdDemoController_getAll5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getall")))
  )
  private[this] lazy val controllers_CurdDemoController_getAll5_invoker = createInvoker(
    CurdDemoController_0.getAll(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CurdDemoController",
      "getAll",
      Nil,
      "GET",
      """""",
      this.prefix + """getall"""
    )
  )

  // @LINE:13
  private[this] lazy val controllers_DemoController_demo6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("demo/"), DynamicPart("message", """[^/]+""",true)))
  )
  private[this] lazy val controllers_DemoController_demo6_invoker = createInvoker(
    DemoController_5.demo(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DemoController",
      "demo",
      Seq(classOf[String]),
      "GET",
      """GET     /operate                     controllers.JpaController.operate()""",
      this.prefix + """demo/""" + "$" + """message<[^/]+>"""
    )
  )

  // @LINE:15
  private[this] lazy val controllers_PersonController_person7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("person")))
  )
  private[this] lazy val controllers_PersonController_person7_invoker = createInvoker(
    PersonController_1.person,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PersonController",
      "person",
      Nil,
      "GET",
      """GET     /cust                       controllers.CustomerController.custDetails""",
      this.prefix + """person"""
    )
  )

  // @LINE:16
  private[this] lazy val controllers_PersonController_addPerson8_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addperson")))
  )
  private[this] lazy val controllers_PersonController_addPerson8_invoker = createInvoker(
    PersonController_1.addPerson,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PersonController",
      "addPerson",
      Nil,
      "POST",
      """""",
      this.prefix + """addperson"""
    )
  )

  // @LINE:17
  private[this] lazy val controllers_DemoController_demoDup9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("dup")))
  )
  private[this] lazy val controllers_DemoController_demoDup9_invoker = createInvoker(
    DemoController_5.demoDup,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DemoController",
      "demoDup",
      Nil,
      "GET",
      """""",
      this.prefix + """dup"""
    )
  )

  // @LINE:18
  private[this] lazy val controllers_UtitlityController_util10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("util")))
  )
  private[this] lazy val controllers_UtitlityController_util10_invoker = createInvoker(
    UtitlityController_6.util(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UtitlityController",
      "util",
      Nil,
      "GET",
      """""",
      this.prefix + """util"""
    )
  )

  // @LINE:19
  private[this] lazy val controllers_UtitlityController_serviceUtil11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("util"), DynamicPart("name", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UtitlityController_serviceUtil11_invoker = createInvoker(
    UtitlityController_6.serviceUtil(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UtitlityController",
      "serviceUtil",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """util""" + "$" + """name<[^/]+>"""
    )
  )

  // @LINE:21
  private[this] lazy val controllers_Application_submit12_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("submit")))
  )
  private[this] lazy val controllers_Application_submit12_invoker = createInvoker(
    Application_10.submit(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "submit",
      Nil,
      "POST",
      """GET     /home                      controllers.HomeController.home()""",
      this.prefix + """submit"""
    )
  )

  // @LINE:22
  private[this] lazy val controllers_JdbcController_conn13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("conn")))
  )
  private[this] lazy val controllers_JdbcController_conn13_invoker = createInvoker(
    JdbcController_4.conn(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.JdbcController",
      "conn",
      Nil,
      "GET",
      """""",
      this.prefix + """conn"""
    )
  )

  // @LINE:25
  private[this] lazy val controllers_Assets_versioned14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned14_invoker = createInvoker(
    Assets_9.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """GET      /getlist                   controllers.JdbcController.findall()
 Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/""" + "$" + """file<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_UserController_user0_route(params) =>
      call { 
        controllers_UserController_user0_invoker.call(UserController_7.user())
      }
  
    // @LINE:7
    case controllers_AsynchronousController_index1_route(params) =>
      call { 
        controllers_AsynchronousController_index1_invoker.call(AsynchronousController_2.index())
      }
  
    // @LINE:8
    case controllers_JavaController_getResult2_route(params) =>
      call { 
        controllers_JavaController_getResult2_invoker.call(JavaController_3.getResult())
      }
  
    // @LINE:9
    case controllers_DownloadController_index3_route(params) =>
      call { 
        controllers_DownloadController_index3_invoker.call(DownloadController_8.index())
      }
  
    // @LINE:10
    case controllers_DownloadController_download4_route(params) =>
      call(params.fromPath[String]("name", None)) { (name) =>
        controllers_DownloadController_download4_invoker.call(DownloadController_8.download(name))
      }
  
    // @LINE:11
    case controllers_CurdDemoController_getAll5_route(params) =>
      call { 
        controllers_CurdDemoController_getAll5_invoker.call(CurdDemoController_0.getAll())
      }
  
    // @LINE:13
    case controllers_DemoController_demo6_route(params) =>
      call(params.fromPath[String]("message", None)) { (message) =>
        controllers_DemoController_demo6_invoker.call(DemoController_5.demo(message))
      }
  
    // @LINE:15
    case controllers_PersonController_person7_route(params) =>
      call { 
        controllers_PersonController_person7_invoker.call(PersonController_1.person)
      }
  
    // @LINE:16
    case controllers_PersonController_addPerson8_route(params) =>
      call { 
        controllers_PersonController_addPerson8_invoker.call(PersonController_1.addPerson)
      }
  
    // @LINE:17
    case controllers_DemoController_demoDup9_route(params) =>
      call { 
        controllers_DemoController_demoDup9_invoker.call(DemoController_5.demoDup)
      }
  
    // @LINE:18
    case controllers_UtitlityController_util10_route(params) =>
      call { 
        controllers_UtitlityController_util10_invoker.call(UtitlityController_6.util())
      }
  
    // @LINE:19
    case controllers_UtitlityController_serviceUtil11_route(params) =>
      call(params.fromPath[String]("name", None)) { (name) =>
        controllers_UtitlityController_serviceUtil11_invoker.call(UtitlityController_6.serviceUtil(name))
      }
  
    // @LINE:21
    case controllers_Application_submit12_route(params) =>
      call { 
        controllers_Application_submit12_invoker.call(Application_10.submit())
      }
  
    // @LINE:22
    case controllers_JdbcController_conn13_route(params) =>
      call { 
        controllers_JdbcController_conn13_invoker.call(JdbcController_4.conn())
      }
  
    // @LINE:25
    case controllers_Assets_versioned14_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned14_invoker.call(Assets_9.versioned(path, file))
      }
  }
}
