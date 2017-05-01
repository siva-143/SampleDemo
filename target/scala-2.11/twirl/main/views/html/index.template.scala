
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
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

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Employee,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(emp:Employee):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.16*/("""
"""),_display_(/*2.2*/main("Welcome to Play")/*2.25*/ {_display_(Seq[Any](format.raw/*2.27*/("""
  """),format.raw/*3.3*/("""<h1>"""),_display_(/*3.8*/emp/*3.11*/.getEmpno),format.raw/*3.20*/(""","""),_display_(/*3.22*/emp/*3.25*/.getEname),format.raw/*3.34*/(""","""),_display_(/*3.36*/emp/*3.39*/.getAge),format.raw/*3.46*/("""</h1>
""")))}),format.raw/*4.2*/("""
"""))
      }
    }
  }

  def render(emp:Employee): play.twirl.api.HtmlFormat.Appendable = apply(emp)

  def f:((Employee) => play.twirl.api.HtmlFormat.Appendable) = (emp) => apply(emp)

  def ref: this.type = this

}


}

/**/
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Wed Apr 26 18:05:37 IST 2017
                  SOURCE: C:/Users/CGLenovo01/Downloads/play-java/play-java-final-demo/app/views/index.scala.html
                  HASH: 9ae72a03d8a89464d5077ee45c4a9c333410fe5a
                  MATRIX: 747->1|856->15|884->18|915->41|954->43|984->47|1014->52|1025->55|1054->64|1082->66|1093->69|1122->78|1150->80|1161->83|1188->90|1225->98
                  LINES: 27->1|32->1|33->2|33->2|33->2|34->3|34->3|34->3|34->3|34->3|34->3|34->3|34->3|34->3|34->3|35->4
                  -- GENERATED --
              */
          