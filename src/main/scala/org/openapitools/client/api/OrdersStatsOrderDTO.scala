package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.time.LocalDate
import java.time.OffsetDateTime

import OrdersStatsOrderDTO._

case class OrdersStatsOrderDTO (
  /* Идентификатор заказа. */
  id: Option[Long],
/* Дата создания заказа.  Формат даты: `ГГГГ-ММ-ДД`.  */
  creationDate: Option[LocalDate],
/* Дата и время, когда статус заказа был изменен в последний раз.  Формат даты и времени: ISO 8601. Например, `2017-11-21T00:00:00`. Часовой пояс — UTC+03:00 (Москва).  */
  statusUpdateDate: Option[OffsetDateTime],
status: Option[OrderStatsStatusType],
/* Идентификатор заказа в информационной системе магазина. */
  partnerOrderId: Option[String],
paymentType: Option[OrdersStatsOrderPaymentType],
/* Тип заказа:  * `false` — настоящий заказ покупателя.  * `true` — [тестовый](../../pushapi/concepts/sandbox.md) заказ Маркета.  */
  fake: Option[Boolean],
deliveryRegion: Option[OrdersStatsDeliveryRegionDTO],
/* Список товаров в заказе после возможных изменений. */
  items: List[OrdersStatsItemDTO],
/* Список товаров в заказе до изменений. */
  initialItems: Option[List[OrdersStatsItemDTO]],
/* Информация о денежных переводах по заказу. */
  payments: List[OrdersStatsPaymentDTO],
/* Информация о комиссиях за заказ. */
  commissions: List[OrdersStatsCommissionDTO])

object OrdersStatsOrderDTO {
  import DateTimeCodecs._

  implicit val OrdersStatsOrderDTOCodecJson: CodecJson[OrdersStatsOrderDTO] = CodecJson.derive[OrdersStatsOrderDTO]
  implicit val OrdersStatsOrderDTODecoder: EntityDecoder[OrdersStatsOrderDTO] = jsonOf[OrdersStatsOrderDTO]
  implicit val OrdersStatsOrderDTOEncoder: EntityEncoder[OrdersStatsOrderDTO] = jsonEncoderOf[OrdersStatsOrderDTO]
}
