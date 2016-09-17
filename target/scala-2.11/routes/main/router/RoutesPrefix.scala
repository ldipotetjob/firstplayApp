
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/ldipotet/scalaplayex/firstplayApp/conf/routes
// @DATE:Wed Apr 06 17:35:42 CEST 2016


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
