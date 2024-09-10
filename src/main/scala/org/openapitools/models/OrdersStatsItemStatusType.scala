package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._

/**
 * Статус товара:  * `REJECTED` — товар был добавлен в созданный заказ, но не был оплачен. * `RETURNED` — товар вернули. 
 */
case class OrdersStatsItemStatusType()

object OrdersStatsItemStatusType {
    /**
     * Creates the codec for converting OrdersStatsItemStatusType from and to JSON.
     */
    implicit val decoder: Decoder[OrdersStatsItemStatusType] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrdersStatsItemStatusType] = deriveEncoder
}
