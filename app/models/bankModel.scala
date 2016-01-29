package models

import play.api.libs.json.Json

case class bankModel
(
  Account: Int,
  Amount: Double
)
object bankModel {
  implicit val formats = Json.format[bankModel]
}
