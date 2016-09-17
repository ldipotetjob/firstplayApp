
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/ldipotet/scalaplayex/firstplayApp/conf/routes
// @DATE:Wed Apr 06 17:35:42 CEST 2016

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  Application_2: controllers.Application,
  // @LINE:9
  ApplicationJson_0: controllers.ApplicationJson,
  // @LINE:15
  Assets_1: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    Application_2: controllers.Application,
    // @LINE:9
    ApplicationJson_0: controllers.ApplicationJson,
    // @LINE:15
    Assets_1: controllers.Assets
  ) = this(errorHandler, Application_2, ApplicationJson_0, Assets_1, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Application_2, ApplicationJson_0, Assets_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.Application.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """greetings""", """controllers.Application.greetings"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """ownresquest""", """controllers.Application.ownresquest"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """places""", """controllers.ApplicationJson.listPlaces"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """save""", """controllers.Application.save"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """upload""", """controllers.Application.upload"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_Application_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_Application_index0_invoker = createInvoker(
    Application_2.index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "index",
      Nil,
      "GET",
      """ Home page""",
      this.prefix + """"""
    )
  )

  // @LINE:7
  private[this] lazy val controllers_Application_greetings1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("greetings")))
  )
  private[this] lazy val controllers_Application_greetings1_invoker = createInvoker(
    Application_2.greetings,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "greetings",
      Nil,
      "GET",
      """""",
      this.prefix + """greetings"""
    )
  )

  // @LINE:8
  private[this] lazy val controllers_Application_ownresquest2_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ownresquest")))
  )
  private[this] lazy val controllers_Application_ownresquest2_invoker = createInvoker(
    Application_2.ownresquest,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "ownresquest",
      Nil,
      "POST",
      """""",
      this.prefix + """ownresquest"""
    )
  )

  // @LINE:9
  private[this] lazy val controllers_ApplicationJson_listPlaces3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("places")))
  )
  private[this] lazy val controllers_ApplicationJson_listPlaces3_invoker = createInvoker(
    ApplicationJson_0.listPlaces,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ApplicationJson",
      "listPlaces",
      Nil,
      "GET",
      """""",
      this.prefix + """places"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_Application_save4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("save")))
  )
  private[this] lazy val controllers_Application_save4_invoker = createInvoker(
    Application_2.save,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "save",
      Nil,
      "POST",
      """""",
      this.prefix + """save"""
    )
  )

  // @LINE:11
  private[this] lazy val controllers_Application_upload5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("upload")))
  )
  private[this] lazy val controllers_Application_upload5_invoker = createInvoker(
    Application_2.upload,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "upload",
      Nil,
      "POST",
      """""",
      this.prefix + """upload"""
    )
  )

  // @LINE:15
  private[this] lazy val controllers_Assets_versioned6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned6_invoker = createInvoker(
    Assets_1.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/$file<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_Application_index0_route(params) =>
      call { 
        controllers_Application_index0_invoker.call(Application_2.index)
      }
  
    // @LINE:7
    case controllers_Application_greetings1_route(params) =>
      call { 
        controllers_Application_greetings1_invoker.call(Application_2.greetings)
      }
  
    // @LINE:8
    case controllers_Application_ownresquest2_route(params) =>
      call { 
        controllers_Application_ownresquest2_invoker.call(Application_2.ownresquest)
      }
  
    // @LINE:9
    case controllers_ApplicationJson_listPlaces3_route(params) =>
      call { 
        controllers_ApplicationJson_listPlaces3_invoker.call(ApplicationJson_0.listPlaces)
      }
  
    // @LINE:10
    case controllers_Application_save4_route(params) =>
      call { 
        controllers_Application_save4_invoker.call(Application_2.save)
      }
  
    // @LINE:11
    case controllers_Application_upload5_route(params) =>
      call { 
        controllers_Application_upload5_invoker.call(Application_2.upload)
      }
  
    // @LINE:15
    case controllers_Assets_versioned6_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned6_invoker.call(Assets_1.versioned(path, file))
      }
  }
}