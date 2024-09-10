package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import OrdersStatsDeliveryRegionDTO._

case class OrdersStatsDeliveryRegionDTO (
  /* Идентификатор региона доставки. */
  id: Option[Long],
/* Название региона доставки. */
  name: Option[String])

object OrdersStatsDeliveryRegionDTO {
  import DateTimeCodecs._

  implicit val OrdersStatsDeliveryRegionDTOCodecJson: CodecJson[OrdersStatsDeliveryRegionDTO] = CodecJson.derive[OrdersStatsDeliveryRegionDTO]
  implicit val OrdersStatsDeliveryRegionDTODecoder: EntityDecoder[OrdersStatsDeliveryRegionDTO] = jsonOf[OrdersStatsDeliveryRegionDTO]
  implicit val OrdersStatsDeliveryRegionDTOEncoder: EntityEncoder[OrdersStatsDeliveryRegionDTO] = jsonEncoderOf[OrdersStatsDeliveryRegionDTO]
}
