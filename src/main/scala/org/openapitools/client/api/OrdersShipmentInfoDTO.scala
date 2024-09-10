package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import OrdersShipmentInfoDTO._

case class OrdersShipmentInfoDTO (
  /* Идентификаторы заказов в отгрузке, для которых можно распечатать ярлыки. */
  orderIdsWithLabels: Set[Long],
/* Идентификаторы заказов в отгрузке, для которых нельзя распечатать ярлыки. */
  orderIdsWithoutLabels: Set[Long])

object OrdersShipmentInfoDTO {
  import DateTimeCodecs._

  implicit val OrdersShipmentInfoDTOCodecJson: CodecJson[OrdersShipmentInfoDTO] = CodecJson.derive[OrdersShipmentInfoDTO]
  implicit val OrdersShipmentInfoDTODecoder: EntityDecoder[OrdersShipmentInfoDTO] = jsonOf[OrdersShipmentInfoDTO]
  implicit val OrdersShipmentInfoDTOEncoder: EntityEncoder[OrdersShipmentInfoDTO] = jsonEncoderOf[OrdersShipmentInfoDTO]
}
