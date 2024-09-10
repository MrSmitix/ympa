package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import java.time.ZonedDateTime

/**
 * Время последнего обновления.
 * @param updatedAt Время последнего обновления.
 */
case class UpdateTimeDTO(updatedAt: ZonedDateTime
                )

object UpdateTimeDTO {
    /**
     * Creates the codec for converting UpdateTimeDTO from and to JSON.
     */
    implicit val decoder: Decoder[UpdateTimeDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[UpdateTimeDTO] = deriveEncoder
}
