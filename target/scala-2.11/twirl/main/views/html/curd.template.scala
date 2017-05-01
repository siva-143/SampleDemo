
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object curd_Scope0 {
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

class curd extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[Employee],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(list:List[Employee]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.23*/("""
"""),_display_(/*2.2*/for(l<-list) yield /*2.14*/{_display_(Seq[Any](format.raw/*2.15*/("""
    """),format.raw/*3.5*/("""<p><em>"""),_display_(/*3.13*/l/*3.14*/.getEmpno),format.raw/*3.23*/("""</em><em>"""),_display_(/*3.33*/l/*3.34*/.getEname),format.raw/*3.43*/("""</em><em>"""),_display_(/*3.53*/l/*3.54*/.getAge),format.raw/*3.61*/("""</em></p>
""")))}),format.raw/*4.2*/("""
"""))
      }
    }
  }

  def render(list:List[Employee]): play.twirl.api.HtmlFormat.Appendable = apply(list)

  def f:((List[Employee]) => play.twirl.api.HtmlFormat.Appendable) = (list) => apply(list)

  def ref: this.type = this

}


}

/**/
object curd extends curd_Scope0.curd
              /*
                  -- GENERATED --
                  DATE: Wed Apr 26 18:05:37 IST 2017
                  SOURCE: C:/Users/CGLenovo01/Downloads/play-java/play-java-final-demo/app/views/curd.scala.html
                  HASH: 21630d99462395a47237693250b5b771fd780932
                  MATRIX: 751->1|867->22|895->25|922->37|960->38|992->44|1026->52|1035->53|1064->62|1100->72|1109->73|1138->82|1174->92|1183->93|1210->100|1251->112
                  LINES: 27->1|32->1|33->2|33->2|33->2|34->3|34->3|34->3|34->3|34->3|34->3|34->3|34->3|34->3|34->3|35->4
                  -- GENERATED --
              */
          