
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object usage_Scope0 {
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

class usage extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[Customers],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(list:List[Customers]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.24*/("""
"""),format.raw/*2.1*/("""<!doctype html>
<html>
    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
        <link rel="shortcut" href=""""),_display_(/*7.37*/routes/*7.43*/.Assets.versioned("images/imagecloud.png")),format.raw/*7.85*/("""">
    </head>
    <body>
<div class="w3-container">
<table class="w3-table-all w3-card-4">
    """),_display_(/*12.6*/for(li<-list) yield /*12.19*/{_display_(Seq[Any](format.raw/*12.20*/("""
        """),format.raw/*13.9*/("""<tr>
            <td>"""),_display_(/*14.18*/li/*14.20*/.getCustomer_id),format.raw/*14.35*/("""</td>
            <td>"""),_display_(/*15.18*/li/*15.20*/.getStore_id),format.raw/*15.32*/("""</td>
            <td>"""),_display_(/*16.18*/li/*16.20*/.getFirst_name),format.raw/*16.34*/("""</td>
            <td>"""),_display_(/*17.18*/li/*17.20*/.getLast_name),format.raw/*17.33*/("""</td>
            <td>"""),_display_(/*18.18*/li/*18.20*/.getEmail),format.raw/*18.29*/("""</td>
            <td>"""),_display_(/*19.18*/li/*19.20*/.getAddress_id),format.raw/*19.34*/("""</td>
            <td>"""),_display_(/*20.18*/li/*20.20*/.getActive),format.raw/*20.30*/("""</td>
            <td>"""),_display_(/*21.18*/li/*21.20*/.getCreate_date),format.raw/*21.35*/("""</td>
            <td>"""),_display_(/*22.18*/li/*22.20*/.getLast_update),format.raw/*22.35*/("""</td>
            <td>"""),_display_(/*23.18*/li/*23.20*/.getClass),format.raw/*23.29*/("""</td>
        </tr>
    """)))}),format.raw/*25.6*/("""
"""),format.raw/*26.1*/("""</table>
</div>
    </body>
</html>"""))
      }
    }
  }

  def render(list:List[Customers]): play.twirl.api.HtmlFormat.Appendable = apply(list)

  def f:((List[Customers]) => play.twirl.api.HtmlFormat.Appendable) = (list) => apply(list)

  def ref: this.type = this

}


}

/**/
object usage extends usage_Scope0.usage
              /*
                  -- GENERATED --
                  DATE: Fri Apr 28 18:38:17 IST 2017
                  SOURCE: C:/Users/CGLenovo01/Downloads/play-java/play-java-final-demo/app/views/usage.scala.html
                  HASH: 7cf5741faa7e07d12e4fd10545864ef24afec6a5
                  MATRIX: 754->1|871->23|899->25|1157->257|1171->263|1233->305|1361->407|1390->420|1429->421|1466->431|1516->454|1527->456|1563->471|1614->495|1625->497|1658->509|1709->533|1720->535|1755->549|1806->573|1817->575|1851->588|1902->612|1913->614|1943->623|1994->647|2005->649|2040->663|2091->687|2102->689|2133->699|2184->723|2195->725|2231->740|2282->764|2293->766|2329->781|2380->805|2391->807|2421->816|2478->843|2507->845
                  LINES: 27->1|32->1|33->2|38->7|38->7|38->7|43->12|43->12|43->12|44->13|45->14|45->14|45->14|46->15|46->15|46->15|47->16|47->16|47->16|48->17|48->17|48->17|49->18|49->18|49->18|50->19|50->19|50->19|51->20|51->20|51->20|52->21|52->21|52->21|53->22|53->22|53->22|54->23|54->23|54->23|56->25|57->26
                  -- GENERATED --
              */
          