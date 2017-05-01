
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/CGLenovo01/Downloads/play-java/play-java-final-demo/conf/routes
// @DATE:Mon May 01 15:04:03 IST 2017

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:15
  class ReversePersonController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:15
    def person: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PersonController.person",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "person"})
        }
      """
    )
  
    // @LINE:16
    def addPerson: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PersonController.addPerson",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addperson"})
        }
      """
    )
  
  }

  // @LINE:25
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:25
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:9
  class ReverseDownloadController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def download: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DownloadController.download",
      """
        function(name0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "download/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("name", name0)})
        }
      """
    )
  
    // @LINE:9
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DownloadController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }

  // @LINE:8
  class ReverseJavaController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def getResult: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.JavaController.getResult",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "getresult"})
        }
      """
    )
  
  }

  // @LINE:18
  class ReverseUtitlityController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:19
    def serviceUtil: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UtitlityController.serviceUtil",
      """
        function(name0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "util" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("name", encodeURIComponent(name0))})
        }
      """
    )
  
    // @LINE:18
    def util: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UtitlityController.util",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "util"})
        }
      """
    )
  
  }

  // @LINE:7
  class ReverseAsynchronousController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:7
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AsynchronousController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "asyn"})
        }
      """
    )
  
  }

  // @LINE:13
  class ReverseDemoController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:17
    def demoDup: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DemoController.demoDup",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "dup"})
        }
      """
    )
  
    // @LINE:13
    def demo: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DemoController.demo",
      """
        function(message0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "demo/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("message", encodeURIComponent(message0))})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseUserController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def user: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.user",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "user"})
        }
      """
    )
  
  }

  // @LINE:22
  class ReverseJdbcController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:22
    def conn: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.JdbcController.conn",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "conn"})
        }
      """
    )
  
  }

  // @LINE:21
  class ReverseApplication(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:21
    def submit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.submit",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "submit"})
        }
      """
    )
  
  }

  // @LINE:11
  class ReverseCurdDemoController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:11
    def getAll: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CurdDemoController.getAll",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "getall"})
        }
      """
    )
  
  }


}
