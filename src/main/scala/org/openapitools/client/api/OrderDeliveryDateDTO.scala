package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.time.LocalDate

import OrderDeliveryDateDTO._

case class OrderDeliveryDateDTO (
  /* Новая дата доставки заказа.  Формат даты: `ГГГГ-ММ-ДД`.  */
  toDate: LocalDate)

object OrderDeliveryDateDTO {
  import DateTimeCodecs._

  implicit val OrderDeliveryDateDTOCodecJson: CodecJson[OrderDeliveryDateDTO] = CodecJson.derive[OrderDeliveryDateDTO]
  implicit val OrderDeliveryDateDTODecoder: EntityDecoder[OrderDeliveryDateDTO] = jsonOf[OrderDeliveryDateDTO]
  implicit val OrderDeliveryDateDTOEncoder: EntityEncoder[OrderDeliveryDateDTO] = jsonEncoderOf[OrderDeliveryDateDTO]
}
