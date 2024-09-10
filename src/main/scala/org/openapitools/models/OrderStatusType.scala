package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._

/**
 * Статус заказа:  * `CANCELLED` — отменен.  * `DELIVERED` — получен покупателем.  * `DELIVERY` — передан в службу доставки.  * `PICKUP` — доставлен в пункт самовывоза.  * `PROCESSING` — находится в обработке.  * `PENDING` — ожидает обработки со стороны продавца.  * `UNPAID` — оформлен, но еще не оплачен (если выбрана оплата при оформлении).  * `PLACING` — оформляется, подготовка к резервированию.  * `RESERVED` — зарезервирован, но недооформлен.  * `PARTIALLY_RETURNED` — возвращен частично.  * `RETURNED` — возвращен полностью.  * `UNKNOWN` — неизвестный статус.  Также могут возвращаться другие значения. Обрабатывать их не требуется. 
 */
case class OrderStatusType()

object OrderStatusType {
    /**
     * Creates the codec for converting OrderStatusType from and to JSON.
     */
    implicit val decoder: Decoder[OrderStatusType] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrderStatusType] = deriveEncoder
}
