package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import OrdersStatsPriceDTO._

case class OrdersStatsPriceDTO (
  `type`: Option[OrdersStatsPriceType],
/* Цена или скидка на единицу товара в заказе. Указана в рублях. Точность — два знака после запятой.  */
  costPerItem: Option[BigDecimal],
/* Суммарная цена или скидка на все единицы товара в заказе. Указана в рублях. Точность — два знака после запятой.  */
  total: Option[BigDecimal])

object OrdersStatsPriceDTO {
  import DateTimeCodecs._

  implicit val OrdersStatsPriceDTOCodecJson: CodecJson[OrdersStatsPriceDTO] = CodecJson.derive[OrdersStatsPriceDTO]
  implicit val OrdersStatsPriceDTODecoder: EntityDecoder[OrdersStatsPriceDTO] = jsonOf[OrdersStatsPriceDTO]
  implicit val OrdersStatsPriceDTOEncoder: EntityEncoder[OrdersStatsPriceDTO] = jsonEncoderOf[OrdersStatsPriceDTO]
}
