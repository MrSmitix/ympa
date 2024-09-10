package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.FeedDTO
import scala.collection.immutable.Seq

/**
 * Ответ на запрос списка прайс-листов.
 * @param feeds Список прайс-листов.
 */
case class GetFeedsResponse(feeds: Seq[FeedDTO]
                )

object GetFeedsResponse {
    /**
     * Creates the codec for converting GetFeedsResponse from and to JSON.
     */
    implicit val decoder: Decoder[GetFeedsResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[GetFeedsResponse] = deriveEncoder
}
