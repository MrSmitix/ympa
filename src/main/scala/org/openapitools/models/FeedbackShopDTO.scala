package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._

/**
 * Информация о магазине.
 * @param name Название магазина.
 */
case class FeedbackShopDTO(name: Option[String]
                )

object FeedbackShopDTO {
    /**
     * Creates the codec for converting FeedbackShopDTO from and to JSON.
     */
    implicit val decoder: Decoder[FeedbackShopDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[FeedbackShopDTO] = deriveEncoder
}
