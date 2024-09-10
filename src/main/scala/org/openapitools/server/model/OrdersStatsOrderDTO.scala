package org.openapitools.server.model

import java.time.LocalDate
import java.time.OffsetDateTime

/**
 * Информация о заказе.
 *
 * @param id Идентификатор заказа. for example: ''null''
 * @param creationDate Дата создания заказа.  Формат даты: `ГГГГ-ММ-ДД`.  for example: ''null''
 * @param statusUpdateDate Дата и время, когда статус заказа был изменен в последний раз.  Формат даты и времени: ISO 8601. Например, `2017-11-21T00:00:00`. Часовой пояс — UTC+03:00 (Москва).  for example: ''null''
 * @param status  for example: ''null''
 * @param partnerOrderId Идентификатор заказа в информационной системе магазина. for example: ''null''
 * @param paymentType  for example: ''null''
 * @param fake Тип заказа:  * `false` — настоящий заказ покупателя.  * `true` — [тестовый](../../pushapi/concepts/sandbox.md) заказ Маркета.  for example: ''null''
 * @param deliveryRegion  for example: ''null''
 * @param items Список товаров в заказе после возможных изменений. for example: ''null''
 * @param initialItems Список товаров в заказе до изменений. for example: ''null''
 * @param payments Информация о денежных переводах по заказу. for example: ''null''
 * @param commissions Информация о комиссиях за заказ. for example: ''null''
*/
final case class OrdersStatsOrderDTO (
  id: Option[Long] = None,
  creationDate: Option[LocalDate] = None,
  statusUpdateDate: Option[OffsetDateTime] = None,
  status: Option[OrderStatsStatusType] = None,
  partnerOrderId: Option[String] = None,
  paymentType: Option[OrdersStatsOrderPaymentType] = None,
  fake: Option[Boolean] = None,
  deliveryRegion: Option[OrdersStatsDeliveryRegionDTO] = None,
  items: Seq[OrdersStatsItemDTO],
  initialItems: Option[Seq[OrdersStatsItemDTO]] = None,
  payments: Seq[OrdersStatsPaymentDTO],
  commissions: Seq[OrdersStatsCommissionDTO]
)

