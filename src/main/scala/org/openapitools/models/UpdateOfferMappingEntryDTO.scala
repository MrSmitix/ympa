package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.OfferMappingDTO
import org.openapitools.models.UpdateMappingsOfferDTO

/**
 * Список товаров.  В теле запроса можно передать от одного до 500 товаров.  Обязательный параметр. 
 * @param mapping 
 * @param awaitingModerationMapping 
 * @param rejectedMapping 
 * @param offer 
 */
case class UpdateOfferMappingEntryDTO(mapping: Option[OfferMappingDTO],
                awaitingModerationMapping: Option[OfferMappingDTO],
                rejectedMapping: Option[OfferMappingDTO],
                offer: Option[UpdateMappingsOfferDTO]
                )

object UpdateOfferMappingEntryDTO {
    /**
     * Creates the codec for converting UpdateOfferMappingEntryDTO from and to JSON.
     */
    implicit val decoder: Decoder[UpdateOfferMappingEntryDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[UpdateOfferMappingEntryDTO] = deriveEncoder
}
