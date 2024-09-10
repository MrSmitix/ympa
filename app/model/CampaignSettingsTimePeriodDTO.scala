package model

import play.api.libs.json._

/**
  * Период, за который рассчитывается итоговый список нерабочих дней службы доставки.
  * @param fromDate Формат даты: `ДД-ММ-ГГГГ`. 
  * @param toDate Формат даты: `ДД-ММ-ГГГГ`. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class CampaignSettingsTimePeriodDTO(
  fromDate: Option[String],
  toDate: Option[String]
)

object CampaignSettingsTimePeriodDTO {
  implicit lazy val campaignSettingsTimePeriodDTOJsonFormat: Format[CampaignSettingsTimePeriodDTO] = Json.format[CampaignSettingsTimePeriodDTO]
}

