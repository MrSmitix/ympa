package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.BigDecimal

/**
 * GPS-координаты широты и долготы. 
 * @param latitude Широта.
 * @param longitude Долгота.
 */
case class GpsDTO(latitude: BigDecimal,
                longitude: BigDecimal
                )

object GpsDTO {
    /**
     * Creates the codec for converting GpsDTO from and to JSON.
     */
    implicit val decoder: Decoder[GpsDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[GpsDTO] = deriveEncoder
}
