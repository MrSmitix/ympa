package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.MappingsOfferDTO
import org.openapitools.models.OfferMappingDTO

/**
 * Список товаров. 
 * @param mapping 
 * @param awaitingModerationMapping 
 * @param rejectedMapping 
 * @param offer 
 */
case class OfferMappingEntryDTO(mapping: Option[OfferMappingDTO],
                awaitingModerationMapping: Option[OfferMappingDTO],
                rejectedMapping: Option[OfferMappingDTO],
                offer: Option[MappingsOfferDTO]
                )

object OfferMappingEntryDTO {
    /**
     * Creates the codec for converting OfferMappingEntryDTO from and to JSON.
     */
    implicit val decoder: Decoder[OfferMappingEntryDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[OfferMappingEntryDTO] = deriveEncoder
}
