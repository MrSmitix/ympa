package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.OfferMappingDTO

/**
 * Информация о карточке товара.
 * @param mapping 
 * @param awaitingModerationMapping 
 * @param rejectedMapping 
 */
case class OfferMappingInfoDTO(mapping: Option[OfferMappingDTO],
                awaitingModerationMapping: Option[OfferMappingDTO],
                rejectedMapping: Option[OfferMappingDTO]
                )

object OfferMappingInfoDTO {
    /**
     * Creates the codec for converting OfferMappingInfoDTO from and to JSON.
     */
    implicit val decoder: Decoder[OfferMappingInfoDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[OfferMappingInfoDTO] = deriveEncoder
}
