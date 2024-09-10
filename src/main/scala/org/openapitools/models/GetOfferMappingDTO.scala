package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.GetMappingDTO
import org.openapitools.models.GetOfferDTO

/**
 * Информация о товаре.
 * @param offer 
 * @param mapping 
 */
case class GetOfferMappingDTO(offer: Option[GetOfferDTO],
                mapping: Option[GetMappingDTO]
                )

object GetOfferMappingDTO {
    /**
     * Creates the codec for converting GetOfferMappingDTO from and to JSON.
     */
    implicit val decoder: Decoder[GetOfferMappingDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[GetOfferMappingDTO] = deriveEncoder
}
