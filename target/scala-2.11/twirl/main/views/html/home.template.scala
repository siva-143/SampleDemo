
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object home_Scope0 {
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

class home extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[User],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(userForm:Form[User]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._;

Seq[Any](format.raw/*1.23*/("""
"""),_display_(/*3.2*/main("Example")/*3.17*/{_display_(Seq[Any](format.raw/*3.18*/("""
    """),format.raw/*4.5*/("""<h1>A simple Form</h1>
    <form action=""""),_display_(/*5.20*/routes/*5.26*/.Application.submit()),format.raw/*5.47*/("""" method="post">
    """),_display_(/*6.6*/helper/*6.12*/.inputText(userForm("username"))),format.raw/*6.44*/("""
    """),_display_(/*7.6*/helper/*7.12*/.inputPassword(userForm("password"))),format.raw/*7.48*/("""
    """),format.raw/*8.5*/("""<input type="submit" class="btn btn-primary" value="submit">
    </form>
""")))}),format.raw/*10.2*/("""
"""))
      }
    }
  }

  def render(userForm:Form[User]): play.twirl.api.HtmlFormat.Appendable = apply(userForm)

  def f:((Form[User]) => play.twirl.api.HtmlFormat.Appendable) = (userForm) => apply(userForm)

  def ref: this.type = this

}


}

/**/
object home extends home_Scope0.home
              /*
                  -- GENERATED --
                  DATE: Tue Apr 25 18:32:23 IST 2017
                  SOURCE: C:/Users/CGLenovo01/Downloads/play-java/play-java-final-demo/app/views/home.scala.html
                  HASH: 46862b01ba38356429f7d072e60268ffd4ebf158
                  MATRIX: 747->1|879->22|907->44|930->59|968->60|1000->66|1069->109|1083->115|1124->136|1172->159|1186->165|1238->197|1270->204|1284->210|1340->246|1372->252|1478->328
                  LINES: 27->1|32->1|33->3|33->3|33->3|34->4|35->5|35->5|35->5|36->6|36->6|36->6|37->7|37->7|37->7|38->8|40->10
                  -- GENERATED --
              */
          