package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.FeedbackDeliveryType

/**
 * Информация о заказе, указанная в отзыве.
 * @param shopOrderId Номер заказа, указанный в отзыве.
 * @param delivery 
 */
case class FeedbackOrderDTO(shopOrderId: Option[String],
                delivery: Option[FeedbackDeliveryType]
                )

object FeedbackOrderDTO {
    /**
     * Creates the codec for converting FeedbackOrderDTO from and to JSON.
     */
    implicit val decoder: Decoder[FeedbackOrderDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[FeedbackOrderDTO] = deriveEncoder
}
