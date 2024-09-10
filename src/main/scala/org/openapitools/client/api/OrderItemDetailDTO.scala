package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import OrderItemDetailDTO._

case class OrderItemDetailDTO (
  /* Количество единиц товара. */
  itemCount: Option[Long],
itemStatus: Option[OrderItemStatusType],
/* Формат даты: `ДД-ММ-ГГГГ`.  */
  updateDate: Option[String])

object OrderItemDetailDTO {
  import DateTimeCodecs._

  implicit val OrderItemDetailDTOCodecJson: CodecJson[OrderItemDetailDTO] = CodecJson.derive[OrderItemDetailDTO]
  implicit val OrderItemDetailDTODecoder: EntityDecoder[OrderItemDetailDTO] = jsonOf[OrderItemDetailDTO]
  implicit val OrderItemDetailDTOEncoder: EntityEncoder[OrderItemDetailDTO] = jsonEncoderOf[OrderItemDetailDTO]
}
