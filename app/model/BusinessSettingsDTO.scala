package model

import play.api.libs.json._

/**
  * Настройки кабинета.
  * @param onlyDefaultPrice Можно ли установить только [базовую цену](*rule): * `false` — можно задать и базовую цену, и цены в конкретных магазинах. * `true` — можно задать только базовую цену. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class BusinessSettingsDTO(
  onlyDefaultPrice: Option[Boolean],
  currency: Option[CurrencyType]
)

object BusinessSettingsDTO {
  implicit lazy val businessSettingsDTOJsonFormat: Format[BusinessSettingsDTO] = Json.format[BusinessSettingsDTO]
}

