package model

import play.api.libs.json._

/**
  * Информация о кабинете и его настройках.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class GetBusinessSettingsInfoDTO(
  info: Option[BusinessDTO],
  settings: Option[BusinessSettingsDTO]
)

object GetBusinessSettingsInfoDTO {
  implicit lazy val getBusinessSettingsInfoDTOJsonFormat: Format[GetBusinessSettingsInfoDTO] = Json.format[GetBusinessSettingsInfoDTO]
}

