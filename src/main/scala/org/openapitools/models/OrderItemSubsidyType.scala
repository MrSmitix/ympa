package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._

/**
 * Тип субсидии:  * `YANDEX_CASHBACK` — скидка по подписке Яндекс Плюс.  * `SUBSIDY` — скидка Маркета (по акциям, промокодам, купонам и т. д.). 
 */
case class OrderItemSubsidyType()

object OrderItemSubsidyType {
    /**
     * Creates the codec for converting OrderItemSubsidyType from and to JSON.
     */
    implicit val decoder: Decoder[OrderItemSubsidyType] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrderItemSubsidyType] = deriveEncoder
}
