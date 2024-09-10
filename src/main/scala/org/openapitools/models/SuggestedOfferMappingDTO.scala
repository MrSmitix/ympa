package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.GetMappingDTO
import org.openapitools.models.SuggestedOfferDTO

/**
 * Товар с соответствующей карточкой на Маркете.
 * @param offer 
 * @param mapping 
 */
case class SuggestedOfferMappingDTO(offer: Option[SuggestedOfferDTO],
                mapping: Option[GetMappingDTO]
                )

object SuggestedOfferMappingDTO {
    /**
     * Creates the codec for converting SuggestedOfferMappingDTO from and to JSON.
     */
    implicit val decoder: Decoder[SuggestedOfferMappingDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[SuggestedOfferMappingDTO] = deriveEncoder
}
