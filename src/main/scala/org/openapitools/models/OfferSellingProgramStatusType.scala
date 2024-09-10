package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._

/**
 * Информация о доступности или недоступности.  * `FINE` — доступно. * `REJECT` — недоступно. 
 */
case class OfferSellingProgramStatusType()

object OfferSellingProgramStatusType {
    /**
     * Creates the codec for converting OfferSellingProgramStatusType from and to JSON.
     */
    implicit val decoder: Decoder[OfferSellingProgramStatusType] = deriveDecoder
    implicit val encoder: ObjectEncoder[OfferSellingProgramStatusType] = deriveEncoder
}
