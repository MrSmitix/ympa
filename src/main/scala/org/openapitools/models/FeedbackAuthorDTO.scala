package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.RegionDTO

/**
 * Информация об авторе отзыва.  Если отзыв оставлен анонимно, параметр не возвращается. 
 * @param name Имя автора отзыва.
 * @param region 
 */
case class FeedbackAuthorDTO(name: Option[String],
                region: Option[RegionDTO]
                )

object FeedbackAuthorDTO {
    /**
     * Creates the codec for converting FeedbackAuthorDTO from and to JSON.
     */
    implicit val decoder: Decoder[FeedbackAuthorDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[FeedbackAuthorDTO] = deriveEncoder
}
