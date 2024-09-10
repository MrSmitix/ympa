package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._

/**
 * Идентификаторы, которые связаны с отзывом.
 * @param orderId Идентификатор заказа на Маркете.
 * @param modelId Идентификатор модели товара.
 */
case class GoodsFeedbackIdentifiersDTO(orderId: Long,
                modelId: Long
                )

object GoodsFeedbackIdentifiersDTO {
    /**
     * Creates the codec for converting GoodsFeedbackIdentifiersDTO from and to JSON.
     */
    implicit val decoder: Decoder[GoodsFeedbackIdentifiersDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[GoodsFeedbackIdentifiersDTO] = deriveEncoder
}
