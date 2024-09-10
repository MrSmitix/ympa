package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import OutletWorkingScheduleDTO._

case class OutletWorkingScheduleDTO (
  /* Признак, работает ли точка продаж в дни государственных праздников.  Возможные значения:  * `false` — точка продаж не работает в дни государственных праздников. * `true` — точка продаж работает в дни государственных праздников.  */
  workInHoliday: Option[Boolean],
/* Список расписаний работы точки продаж.  */
  scheduleItems: List[OutletWorkingScheduleItemDTO])

object OutletWorkingScheduleDTO {
  import DateTimeCodecs._

  implicit val OutletWorkingScheduleDTOCodecJson: CodecJson[OutletWorkingScheduleDTO] = CodecJson.derive[OutletWorkingScheduleDTO]
  implicit val OutletWorkingScheduleDTODecoder: EntityDecoder[OutletWorkingScheduleDTO] = jsonOf[OutletWorkingScheduleDTO]
  implicit val OutletWorkingScheduleDTOEncoder: EntityEncoder[OutletWorkingScheduleDTO] = jsonEncoderOf[OutletWorkingScheduleDTO]
}
