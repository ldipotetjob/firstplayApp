package controllers

//curl -X POST --header "Content-type: application/json" --header "Accept: application/json" -d "{\"id\":100}"  "http://localhost:9000/ownresquest"

import play.api.libs.json.JsValue
import play.api.mvc._

class Application extends Controller {

  def index = Action {
    Ok(views.html.index("Your new application is ready.I'm Here"))
  }
    def greetings = Action {
    Ok("Hello world")
  }

   def ownresquest = Action { implicit request =>
  		Ok("Got request [" + request.body + "]")
   }


  //curl -X POST --header "Content-type: application/json" --header "Accept: application/json" -d "{\"id\":100}"  "http://localhost:9000/save"

  def save = Action { request =>
    val body: AnyContent = request.body
    val jsonBody: Option[JsValue] = body.asJson

    // Expecting json body
    jsonBody.size
    jsonBody.map { json =>
      Ok("Got: " + (json \ "id").get.toString())
    }.getOrElse {
      BadRequest("Expecting application/json request body")
    }
  }

  // curl -X POST -F "image=@/Users/ldipotet/Desktop/nike.png" "http://localhost:9000/upload"
  // curl -F "image=@/Users/ldipotet/Desktop/nike.png" "http://localhost:9000/upload"

  def upload = Action(parse.multipartFormData) { request =>
    request.body.file("image").map { picture =>
      import java.io.File
      val filename = picture.filename
      val contentType = picture.contentType
      picture.ref.moveTo(new File(s"/Users/ldipotet/borrar1/$filename"))
      Ok("File uploaded")
    }.getOrElse {
      Redirect(routes.Application.index).flashing(
        "error" -> "Missing file")
    }
  }


  def foo = Action(parse.maxLength(512 * 1024, parser = parse.anyContent)) { implicit req =>

    req.body match {
      case Left(_) => EntityTooLarge
      case Right(body) => Ok("This is totally not too large")
    }

  }







}
