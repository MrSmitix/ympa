package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import OutletWorkingScheduleItemDTO._

case class OutletWorkingScheduleItemDTO (
  startDay: DayOfWeekType,
endDay: DayOfWeekType,
/* Точка продаж работает c указанного часа.  Формат: `ЧЧ:ММ`.  */
  startTime: String,
/* Точка продаж работает до указанного часа.  Формат: `ЧЧ:ММ`.  */
  endTime: String)

object OutletWorkingScheduleItemDTO {
  import DateTimeCodecs._

  implicit val OutletWorkingScheduleItemDTOCodecJson: CodecJson[OutletWorkingScheduleItemDTO] = CodecJson.derive[OutletWorkingScheduleItemDTO]
  implicit val OutletWorkingScheduleItemDTODecoder: EntityDecoder[OutletWorkingScheduleItemDTO] = jsonOf[OutletWorkingScheduleItemDTO]
  implicit val OutletWorkingScheduleItemDTOEncoder: EntityEncoder[OutletWorkingScheduleItemDTO] = jsonEncoderOf[OutletWorkingScheduleItemDTO]
}
