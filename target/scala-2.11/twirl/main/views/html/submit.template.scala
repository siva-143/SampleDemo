
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object submit_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class submit extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<html>
    """),format.raw/*3.86*/("""
"""),format.raw/*4.1*/("""<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>
    <body>
        <div ng-app="myApp" ng-controller="myCtrl">
           <input type="text" ng-model="myUrl">
            <h3>"""),format.raw/*8.17*/("""{"""),format.raw/*8.18*/("""{"""),format.raw/*8.19*/("""myUrl"""),format.raw/*8.24*/("""}"""),format.raw/*8.25*/("""}"""),format.raw/*8.26*/("""</h3>
        </div>
        <p>This example uses the built-in $location service to get the absolute url of the page.</p>
        <script>
        var app = angular.module('myApp', []);
        app.controller('myCtrl', function($scope,$locale)"""),format.raw/*13.58*/("""{"""),format.raw/*13.59*/("""
            """),format.raw/*14.13*/("""$scope.myUrl ="weiogjguwrpsgwrogwrgw";
        """),format.raw/*15.9*/("""}"""),format.raw/*15.10*/(""");
        </script>
    </body>
</html>
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object submit extends submit_Scope0.submit
              /*
                  -- GENERATED --
                  DATE: Mon May 01 20:36:47 IST 2017
                  SOURCE: C:/Users/CGLenovo01/Downloads/play-java/play-java-final-demo/app/views/submit.scala.html
                  HASH: 095e1ff0c9d4a4c1aa72a3f820fb83441589afce
                  MATRIX: 829->0|885->110|913->112|1164->336|1192->337|1220->338|1252->343|1280->344|1308->345|1584->593|1613->594|1655->608|1730->656|1759->657
                  LINES: 32->1|34->3|35->4|39->8|39->8|39->8|39->8|39->8|39->8|44->13|44->13|45->14|46->15|46->15
                  -- GENERATED --
              */
          