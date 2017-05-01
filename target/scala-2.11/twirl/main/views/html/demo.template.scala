
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object demo_Scope0 {
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

class demo extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message:String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.18*/("""
"""),format.raw/*2.1*/("""<!doctype html>
<html>
    <head>
        <title>"""),_display_(/*5.17*/message),format.raw/*5.24*/("""</title>
    </head>
    <body>
        <marquee>"""),_display_(/*8.19*/message),format.raw/*8.26*/("""</marquee>
        <marquee direction="up" style="font-size:30px;">"""),_display_(/*9.58*/message),format.raw/*9.65*/("""</marquee>
        <div>
            <img src=""""),_display_(/*11.24*/routes/*11.30*/.Assets.versioned("images/imagecloud.png")),format.raw/*11.72*/("""">
        </div>
    </body>
</html>"""))
      }
    }
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}


}

/**/
object demo extends demo_Scope0.demo
              /*
                  -- GENERATED --
                  DATE: Fri Apr 21 21:48:55 IST 2017
                  SOURCE: C:/Users/CGLenovo01/Downloads/play-java/play-java-final-demo/app/views/demo.scala.html
                  HASH: d5c7becdb771e0d3384240a4627e468ed48b3ecc
                  MATRIX: 743->1|854->17|882->19|961->72|988->79|1067->132|1094->139|1189->208|1216->215|1293->265|1308->271|1371->313
                  LINES: 27->1|32->1|33->2|36->5|36->5|39->8|39->8|40->9|40->9|42->11|42->11|42->11
                  -- GENERATED --
              */
          