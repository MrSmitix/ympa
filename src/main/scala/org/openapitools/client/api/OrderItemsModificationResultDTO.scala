package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import OrderItemsModificationResultDTO._

case class OrderItemsModificationResultDTO (
  /* Список позиций в заказе, подлежащих маркировке. */
  items: List[BriefOrderItemDTO])

object OrderItemsModificationResultDTO {
  import DateTimeCodecs._

  implicit val OrderItemsModificationResultDTOCodecJson: CodecJson[OrderItemsModificationResultDTO] = CodecJson.derive[OrderItemsModificationResultDTO]
  implicit val OrderItemsModificationResultDTODecoder: EntityDecoder[OrderItemsModificationResultDTO] = jsonOf[OrderItemsModificationResultDTO]
  implicit val OrderItemsModificationResultDTOEncoder: EntityEncoder[OrderItemsModificationResultDTO] = jsonEncoderOf[OrderItemsModificationResultDTO]
}
