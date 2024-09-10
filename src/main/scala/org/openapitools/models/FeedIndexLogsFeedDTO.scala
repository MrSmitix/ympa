package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._

/**
 * Информация о прайс-листе.
 * @param id Идентификатор прайс-листа.
 */
case class FeedIndexLogsFeedDTO(id: Option[Long]
                )

object FeedIndexLogsFeedDTO {
    /**
     * Creates the codec for converting FeedIndexLogsFeedDTO from and to JSON.
     */
    implicit val decoder: Decoder[FeedIndexLogsFeedDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[FeedIndexLogsFeedDTO] = deriveEncoder
}
