package model

import play.api.libs.json._

/**
  * Ответ на запрос информации о точке продаж.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class GetOutletResponse(
  outlet: Option[FullOutletDTO]
)

object GetOutletResponse {
  implicit lazy val getOutletResponseJsonFormat: Format[GetOutletResponse] = Json.format[GetOutletResponse]
}

