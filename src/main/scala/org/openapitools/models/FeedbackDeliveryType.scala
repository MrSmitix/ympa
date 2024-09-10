package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._

/**
 * Способ покупки, указанный в отзыве:  * `DELIVERY` — доставка. * `PICKUP` — самовывоз. * `INSTORE` — в магазине. 
 */
case class FeedbackDeliveryType()

object FeedbackDeliveryType {
    /**
     * Creates the codec for converting FeedbackDeliveryType from and to JSON.
     */
    implicit val decoder: Decoder[FeedbackDeliveryType] = deriveDecoder
    implicit val encoder: ObjectEncoder[FeedbackDeliveryType] = deriveEncoder
}
