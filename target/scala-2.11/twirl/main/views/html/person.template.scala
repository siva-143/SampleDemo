
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object person_Scope0 {
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

class person extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(person:String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.17*/("""
"""),format.raw/*2.1*/("""<!doctype html>
    <html>
        <head>
            <title>"""),_display_(/*5.21*/person),format.raw/*5.27*/("""</title>
        </head>
        <body>
            <form action=""""),_display_(/*8.28*/routes/*8.34*/.PersonController.addPerson()),format.raw/*8.63*/("""" method="post">
                <span style="font-weight:bold;color:steelblue;font-size:30px;">AddPerson Name:</span><input type="text" name="person">
                <input type="submit" name="but" value="AddPerson">
            </form>
        </body>
    </html>"""))
      }
    }
  }

  def render(person:String): play.twirl.api.HtmlFormat.Appendable = apply(person)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (person) => apply(person)

  def ref: this.type = this

}


}

/**/
object person extends person_Scope0.person
              /*
                  -- GENERATED --
                  DATE: Fri Apr 21 21:48:55 IST 2017
                  SOURCE: C:/Users/CGLenovo01/Downloads/play-java/play-java-final-demo/app/views/person.scala.html
                  HASH: f53fdf89e7f35db2dd63c57182c701d4ed8d59a4
                  MATRIX: 747->1|857->16|885->18|976->83|1002->89|1098->159|1112->165|1161->194
                  LINES: 27->1|32->1|33->2|36->5|36->5|39->8|39->8|39->8
                  -- GENERATED --
              */
          