package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._

/**
 * Информация о трек-номерах.
 * @param trackCode Трек-код почтового отправления.
 */
case class TrackDTO(trackCode: Option[String]
                )

object TrackDTO {
    /**
     * Creates the codec for converting TrackDTO from and to JSON.
     */
    implicit val decoder: Decoder[TrackDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[TrackDTO] = deriveEncoder
}
