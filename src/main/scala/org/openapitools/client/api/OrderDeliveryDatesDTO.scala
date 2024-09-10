package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import OrderDeliveryDatesDTO._

case class OrderDeliveryDatesDTO (
  /* Формат даты: `ДД-ММ-ГГГГ`.  */
  fromDate: Option[String],
/* Формат даты: `ДД-ММ-ГГГГ`.  */
  toDate: Option[String],
/* Начало интервала времени доставки.  Передается только совместно с параметром `type=DELIVERY`.  Формат времени: 24-часовой, `ЧЧ:ММ`. В качестве минут всегда должно быть указано `00` (исключение — `23:59`).  Минимальное значение: `00:00`.  */
  fromTime: Option[String],
/* Конец интервала времени доставки.  Передается только совместно с параметром `type=DELIVERY`.  Формат времени: 24-часовой, `ЧЧ:ММ`. В качестве минут всегда должно быть указано `00` (исключение — `23:59`).  Максимальное значение: `23:59`.  */
  toTime: Option[String],
/* Формат даты: `ДД-ММ-ГГГГ`.  */
  realDeliveryDate: Option[String])

object OrderDeliveryDatesDTO {
  import DateTimeCodecs._

  implicit val OrderDeliveryDatesDTOCodecJson: CodecJson[OrderDeliveryDatesDTO] = CodecJson.derive[OrderDeliveryDatesDTO]
  implicit val OrderDeliveryDatesDTODecoder: EntityDecoder[OrderDeliveryDatesDTO] = jsonOf[OrderDeliveryDatesDTO]
  implicit val OrderDeliveryDatesDTOEncoder: EntityEncoder[OrderDeliveryDatesDTO] = jsonEncoderOf[OrderDeliveryDatesDTO]
}
