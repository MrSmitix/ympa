package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import OrdersStatsCommissionDTO._

case class OrdersStatsCommissionDTO (
  `type`: Option[OrdersStatsCommissionType],
/* Сумма в рублях, которая была выставлена в момент создания заказа и которую нужно оплатить. Точность — два знака после запятой.  */
  actual: Option[BigDecimal])

object OrdersStatsCommissionDTO {
  import DateTimeCodecs._

  implicit val OrdersStatsCommissionDTOCodecJson: CodecJson[OrdersStatsCommissionDTO] = CodecJson.derive[OrdersStatsCommissionDTO]
  implicit val OrdersStatsCommissionDTODecoder: EntityDecoder[OrdersStatsCommissionDTO] = jsonOf[OrdersStatsCommissionDTO]
  implicit val OrdersStatsCommissionDTOEncoder: EntityEncoder[OrdersStatsCommissionDTO] = jsonEncoderOf[OrdersStatsCommissionDTO]
}
