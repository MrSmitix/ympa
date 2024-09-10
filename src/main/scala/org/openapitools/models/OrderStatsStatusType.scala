package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._

/**
 * Текущий статус заказа:  * `CANCELLED_BEFORE_PROCESSING` — заказ отменен до начала его обработки.  * `CANCELLED_IN_DELIVERY` — заказ отменен во время его доставки.  * `CANCELLED_IN_PROCESSING` — заказ отменен во время его обработки.  * `DELIVERY` — заказ передан службе доставки.  * `DELIVERED` — заказ доставлен.  * `PARTIALLY_DELIVERED` — заказ частично доставлен.  * `PARTIALLY_RETURNED` — заказ частично возвращен покупателем.  * `PENDING` — заказ ожидает подтверждения.  * `PICKUP` — заказ доставлен в пункт выдачи.  * `PROCESSING` — заказ в обработке.  * `RESERVED` — товар зарезервирован на складе.  * `RETURNED` — заказ полностью возвращен покупателем.  * `UNKNOWN` — неизвестный статус заказа.  * `UNPAID` — заказ от юридического лица ожидает оплаты.  * `LOST` — заказ утерян. 
 */
case class OrderStatsStatusType()

object OrderStatsStatusType {
    /**
     * Creates the codec for converting OrderStatsStatusType from and to JSON.
     */
    implicit val decoder: Decoder[OrderStatsStatusType] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrderStatsStatusType] = deriveEncoder
}
