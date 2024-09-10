package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.FeedDownloadErrorDTO
import org.openapitools.models.FeedStatusType

/**
 * Информация о последней загрузке прайс-листа.
 * @param status 
 * @param error 
 */
case class FeedDownloadDTO(status: Option[FeedStatusType],
                error: Option[FeedDownloadErrorDTO]
                )

object FeedDownloadDTO {
    /**
     * Creates the codec for converting FeedDownloadDTO from and to JSON.
     */
    implicit val decoder: Decoder[FeedDownloadDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[FeedDownloadDTO] = deriveEncoder
}
