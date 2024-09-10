package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.FeedContentErrorType

/**
 * Информация об ошибке в содержимом прайс-листа. Выводится, если параметр `content status=ERROR`. 
 * @param _type 
 */
case class FeedContentErrorDTO(_type: Option[FeedContentErrorType]
                )

object FeedContentErrorDTO {
    /**
     * Creates the codec for converting FeedContentErrorDTO from and to JSON.
     */
    implicit val decoder: Decoder[FeedContentErrorDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[FeedContentErrorDTO] = deriveEncoder
}
