package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._

/**
 * Вид маппинга.
 */
case class OfferMappingKindType()

object OfferMappingKindType {
    /**
     * Creates the codec for converting OfferMappingKindType from and to JSON.
     */
    implicit val decoder: Decoder[OfferMappingKindType] = deriveDecoder
    implicit val encoder: ObjectEncoder[OfferMappingKindType] = deriveEncoder
}
