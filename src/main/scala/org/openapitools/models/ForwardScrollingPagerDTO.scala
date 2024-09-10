package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._

/**
 * Ссылка на следующую страницу. 
 * @param nextPageToken Идентификатор следующей страницы результатов.
 */
case class ForwardScrollingPagerDTO(nextPageToken: Option[String]
                )

object ForwardScrollingPagerDTO {
    /**
     * Creates the codec for converting ForwardScrollingPagerDTO from and to JSON.
     */
    implicit val decoder: Decoder[ForwardScrollingPagerDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[ForwardScrollingPagerDTO] = deriveEncoder
}
