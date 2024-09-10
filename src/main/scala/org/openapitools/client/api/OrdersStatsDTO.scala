package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import OrdersStatsDTO._

case class OrdersStatsDTO (
  /* Список заказов. */
  orders: List[OrdersStatsOrderDTO],
paging: Option[ForwardScrollingPagerDTO])

object OrdersStatsDTO {
  import DateTimeCodecs._

  implicit val OrdersStatsDTOCodecJson: CodecJson[OrdersStatsDTO] = CodecJson.derive[OrdersStatsDTO]
  implicit val OrdersStatsDTODecoder: EntityDecoder[OrdersStatsDTO] = jsonOf[OrdersStatsDTO]
  implicit val OrdersStatsDTOEncoder: EntityEncoder[OrdersStatsDTO] = jsonEncoderOf[OrdersStatsDTO]
}
