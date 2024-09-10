package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._

/**
 * Варианты причин, по которым заказ не может быть отменен.  * `ORDER_DELIVERED` — заказ уже доставлен. * `ORDER_IN_DELIVERY` — заказ уже у курьера. 
 */
case class OrderCancellationReasonType()

object OrderCancellationReasonType {
    /**
     * Creates the codec for converting OrderCancellationReasonType from and to JSON.
     */
    implicit val decoder: Decoder[OrderCancellationReasonType] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrderCancellationReasonType] = deriveEncoder
}
