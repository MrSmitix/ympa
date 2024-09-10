package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._

/**
 * Информация о предложениях прайс-листа.
 * @param rejectedCount Количество предложений, который не опубликованы на Маркете из-за найденных ошибок.
 * @param totalCount Количество предложений в прайс-листе.
 */
case class FeedIndexLogsOffersDTO(rejectedCount: Option[Long],
                totalCount: Option[Long]
                )

object FeedIndexLogsOffersDTO {
    /**
     * Creates the codec for converting FeedIndexLogsOffersDTO from and to JSON.
     */
    implicit val decoder: Decoder[FeedIndexLogsOffersDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[FeedIndexLogsOffersDTO] = deriveEncoder
}
