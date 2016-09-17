package controllers

import play.api.mvc._
import play.api.libs.json._
import play.api.libs.functional.syntax._

class ApplicationJson extends Controller {

  implicit val locationWrites: Writes[Location] = (
    (JsPath \ "lat").write[Double] and
      (JsPath \ "long").write[Double]
    )(unlift(Location.unapply))

  implicit val placeWrites: Writes[Place] = (
    (JsPath \ "name").write[String] and
      (JsPath \ "location").write[Location]
    )(unlift(Place.unapply))

  def listPlaces = Action {
    val json = Json.toJson(Place.list)
    Ok(json)
  }

}
