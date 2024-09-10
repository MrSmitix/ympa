package model

import play.api.libs.json._

/**
  * Информация о трек-номерах.
  * @param trackCode Трек-код почтового отправления.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class TrackDTO(
  trackCode: Option[String]
)

object TrackDTO {
  implicit lazy val trackDTOJsonFormat: Format[TrackDTO] = Json.format[TrackDTO]
}

