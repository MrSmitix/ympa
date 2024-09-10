package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.FeedDTO

/**
 * Ответ на запрос информации о прайс-листе.
 * @param feed 
 */
case class GetFeedResponse(feed: Option[FeedDTO]
                )

object GetFeedResponse {
    /**
     * Creates the codec for converting GetFeedResponse from and to JSON.
     */
    implicit val decoder: Decoder[GetFeedResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[GetFeedResponse] = deriveEncoder
}
