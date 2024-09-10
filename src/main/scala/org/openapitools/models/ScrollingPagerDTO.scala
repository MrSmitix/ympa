package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._

/**
 * Информация о страницах результатов.
 * @param nextPageToken Идентификатор следующей страницы результатов.
 * @param prevPageToken Идентификатор предыдущей страницы результатов.
 */
case class ScrollingPagerDTO(nextPageToken: Option[String],
                prevPageToken: Option[String]
                )

object ScrollingPagerDTO {
    /**
     * Creates the codec for converting ScrollingPagerDTO from and to JSON.
     */
    implicit val decoder: Decoder[ScrollingPagerDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[ScrollingPagerDTO] = deriveEncoder
}
