
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/CGLenovo01/Downloads/play-java/play-java-final-demo/conf/routes
// @DATE:Mon May 01 15:04:03 IST 2017


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
