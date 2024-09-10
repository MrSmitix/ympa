package model

import play.api.libs.json._

/**
  * Расписание работы службы доставки в своем регионе.
  * @param availableOnHolidays Признак работы службы доставки в государственные праздники. Возможные значения. * `false` — служба доставки не работает в праздничные дни. * `true` — служба доставки работает в праздничные дни. 
  * @param customHolidays Список дней, в которые служба доставки не работает. Дни магазин указал в кабинете продавца на Маркете.
  * @param customWorkingDays Список выходных и праздничных дней, в которые служба доставки работает. Дни магазин указал в кабинете продавца на Маркете.
  * @param totalHolidays Итоговый список нерабочих дней службы доставки. Список рассчитывается с учетом выходных, нерабочих дней и государственных праздников. Информацию по ним магазин указывает в кабинете продавца на Маркете.
  * @param weeklyHolidays Список выходных дней недели и государственных праздников.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class CampaignSettingsScheduleDTO(
  availableOnHolidays: Option[Boolean],
  customHolidays: List[String],
  customWorkingDays: List[String],
  period: Option[CampaignSettingsTimePeriodDTO],
  totalHolidays: List[String],
  weeklyHolidays: List[Int]
)

object CampaignSettingsScheduleDTO {
  implicit lazy val campaignSettingsScheduleDTOJsonFormat: Format[CampaignSettingsScheduleDTO] = Json.format[CampaignSettingsScheduleDTO]
}

