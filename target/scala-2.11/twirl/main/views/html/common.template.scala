
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object common_Scope0 {
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

class common extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/("""
"""),format.raw/*2.1*/("""<!doctype html>
<html>
    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href=""""),_display_(/*6.39*/routes/*6.45*/.Assets.versioned("stylesheets/w3.css")),format.raw/*6.84*/("""">
        <link rel="stylesheet" href=""""),_display_(/*7.39*/routes/*7.45*/.Assets.versioned("stylesheets/icon.css")),format.raw/*7.86*/("""">
        <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css"><link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    </head>
    <body>
        <span class="w3-padding w3-xlarge w3-container w3-teal"><a href="/download/C://Users/CGLenovo01/Downloads/eclipse-inst-win64.exe"><i class="fa fa-download">Download File</i></a></span>
        <i class="fa fa-home">download</i>
        <div class="w3-container">
            <h1>Using Font Awesome Icons</h1>

            <div class="w3-padding w3-xlarge w3-teal w3-ripple" style="width:300px;">
                <i class="fa fa-download"></i>
            </div>
            <p><button class="w3-btn w3-orange w3-xlarge"><i class="w3-margin-left fa fa-download"><a style="text-decoration:none;" href="/download/C://Users/CGLenovo01/Downloads/eclipse-inst-win64.exe">Download</a></i></button></p>
            <div class="w3-container">
                <h2>Border Around Table</h2>
                <p>The w3-border class adds a border around the table.</p>

                <table class="w3-table w3-striped w3-border" style="width:50%;border:1px solid black">
                    <tr>
                        <th>First Name</th>
                        <th>Last Name</th>
                        <th>Points</th>
                    </tr>
                    <tr>
                        <td>Jill</td>
                        <td>Smith</td>
                        <td>50</td>
                    </tr>
                    <tr>
                        <td>Eve</td>
                        <td>Jackson</td>
                        <td>94</td>
                    </tr>
                    <tr>
                        <td>Adam</td>
                        <td>Johnson</td>
                        <td>67</td>
                    </tr>
                </table>
            </div>
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
object common extends common_Scope0.common
              /*
                  -- GENERATED --
                  DATE: Wed Apr 26 22:11:14 IST 2017
                  SOURCE: C:/Users/CGLenovo01/Downloads/play-java/play-java-final-demo/app/views/common.scala.html
                  HASH: 40998926b2e28f03a5851ecf549d6fb4216707c0
                  MATRIX: 740->1|836->3|864->5|1043->158|1057->164|1116->203|1184->245|1198->251|1259->292
                  LINES: 27->1|32->1|33->2|37->6|37->6|37->6|38->7|38->7|38->7
                  -- GENERATED --
              */
          