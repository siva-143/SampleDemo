
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object show_Scope0 {
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

     object show_Scope1 {
import scala.collection.mutable

class show extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[Student],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(student:List[Student]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.25*/("""
"""),_display_(/*3.2*/main("Displaying data in a table format")/*3.43*/{_display_(Seq[Any](format.raw/*3.44*/("""

""")))}))
      }
    }
  }

  def render(student:List[Student]): play.twirl.api.HtmlFormat.Appendable = apply(student)

  def f:((List[Student]) => play.twirl.api.HtmlFormat.Appendable) = (student) => apply(student)

  def ref: this.type = this

}


}
}

/**/
object show extends show_Scope0.show_Scope1.show
              /*
                  -- GENERATED --
                  DATE: Tue Apr 25 17:40:19 IST 2017
                  SOURCE: C:/Users/CGLenovo01/Downloads/play-java/play-java-final-demo/app/views/show.scala.html
                  HASH: 58895b564aeb6ccc0c9b9ef4dff0e20e434eb030
                  MATRIX: 809->35|927->58|955->61|1004->102|1042->103
                  LINES: 30->2|35->2|36->3|36->3|36->3
                  -- GENERATED --
              */
          