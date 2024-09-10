package model

import play.api.libs.json._

/**
  * Фильтры для получения списка акций.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class GetPromosRequest(
  participation: Option[PromoParticipationType],
  mechanics: Option[MechanicsType]
)

object GetPromosRequest {
  implicit lazy val getPromosRequestJsonFormat: Format[GetPromosRequest] = Json.format[GetPromosRequest]
}

