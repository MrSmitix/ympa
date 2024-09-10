package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CampaignSettingsScheduleDTO._

case class CampaignSettingsScheduleDTO (
  /* Признак работы службы доставки в государственные праздники. Возможные значения. * `false` — служба доставки не работает в праздничные дни. * `true` — служба доставки работает в праздничные дни.  */
  availableOnHolidays: Option[Boolean],
/* Список дней, в которые служба доставки не работает. Дни магазин указал в кабинете продавца на Маркете. */
  customHolidays: List[String],
/* Список выходных и праздничных дней, в которые служба доставки работает. Дни магазин указал в кабинете продавца на Маркете. */
  customWorkingDays: List[String],
period: Option[CampaignSettingsTimePeriodDTO],
/* Итоговый список нерабочих дней службы доставки. Список рассчитывается с учетом выходных, нерабочих дней и государственных праздников. Информацию по ним магазин указывает в кабинете продавца на Маркете. */
  totalHolidays: List[String],
/* Список выходных дней недели и государственных праздников. */
  weeklyHolidays: List[Integer])

object CampaignSettingsScheduleDTO {
  import DateTimeCodecs._

  implicit val CampaignSettingsScheduleDTOCodecJson: CodecJson[CampaignSettingsScheduleDTO] = CodecJson.derive[CampaignSettingsScheduleDTO]
  implicit val CampaignSettingsScheduleDTODecoder: EntityDecoder[CampaignSettingsScheduleDTO] = jsonOf[CampaignSettingsScheduleDTO]
  implicit val CampaignSettingsScheduleDTOEncoder: EntityEncoder[CampaignSettingsScheduleDTO] = jsonEncoderOf[CampaignSettingsScheduleDTO]
}
