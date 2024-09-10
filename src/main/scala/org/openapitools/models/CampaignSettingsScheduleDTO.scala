package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.CampaignSettingsTimePeriodDTO
import scala.collection.immutable.Seq

/**
 * Расписание работы службы доставки в своем регионе.
 * @param availableOnHolidays Признак работы службы доставки в государственные праздники. Возможные значения. * `false` — служба доставки не работает в праздничные дни. * `true` — служба доставки работает в праздничные дни. 
 * @param customHolidays Список дней, в которые служба доставки не работает. Дни магазин указал в кабинете продавца на Маркете.
 * @param customWorkingDays Список выходных и праздничных дней, в которые служба доставки работает. Дни магазин указал в кабинете продавца на Маркете.
 * @param period 
 * @param totalHolidays Итоговый список нерабочих дней службы доставки. Список рассчитывается с учетом выходных, нерабочих дней и государственных праздников. Информацию по ним магазин указывает в кабинете продавца на Маркете.
 * @param weeklyHolidays Список выходных дней недели и государственных праздников.
 */
case class CampaignSettingsScheduleDTO(availableOnHolidays: Option[Boolean],
                customHolidays: Seq[String],
                customWorkingDays: Seq[String],
                period: Option[CampaignSettingsTimePeriodDTO],
                totalHolidays: Seq[String],
                weeklyHolidays: Seq[Int]
                )

object CampaignSettingsScheduleDTO {
    /**
     * Creates the codec for converting CampaignSettingsScheduleDTO from and to JSON.
     */
    implicit val decoder: Decoder[CampaignSettingsScheduleDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[CampaignSettingsScheduleDTO] = deriveEncoder
}
