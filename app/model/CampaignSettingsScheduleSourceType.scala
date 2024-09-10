package model

import play.api.libs.json._

/**
  * Источник информации о расписании работы службы доставки. Возможные значения: * `WEB` — информация получена из настроек кабинета продавца на Маркете. * `YML` — информация получена из прайс-листа магазина. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class CampaignSettingsScheduleSourceType(
)

object CampaignSettingsScheduleSourceType {
  implicit lazy val campaignSettingsScheduleSourceTypeJsonFormat: Format[CampaignSettingsScheduleSourceType] = Json.format[CampaignSettingsScheduleSourceType]
}

