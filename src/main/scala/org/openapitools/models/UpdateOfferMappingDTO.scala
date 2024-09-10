package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.UpdateMappingDTO
import org.openapitools.models.UpdateOfferDTO

/**
 * Информация о товаре.
 * @param offer 
 * @param mapping 
 */
case class UpdateOfferMappingDTO(offer: UpdateOfferDTO,
                mapping: Option[UpdateMappingDTO]
                )

object UpdateOfferMappingDTO {
    /**
     * Creates the codec for converting UpdateOfferMappingDTO from and to JSON.
     */
    implicit val decoder: Decoder[UpdateOfferMappingDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[UpdateOfferMappingDTO] = deriveEncoder
}
