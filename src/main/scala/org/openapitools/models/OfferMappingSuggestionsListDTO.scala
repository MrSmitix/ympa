package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.EnrichedMappingsOfferDTO
import scala.collection.immutable.Seq

/**
 * Список рекомендованных карточек товара.
 * @param offers Список товаров.
 */
case class OfferMappingSuggestionsListDTO(offers: Seq[EnrichedMappingsOfferDTO]
                )

object OfferMappingSuggestionsListDTO {
    /**
     * Creates the codec for converting OfferMappingSuggestionsListDTO from and to JSON.
     */
    implicit val decoder: Decoder[OfferMappingSuggestionsListDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[OfferMappingSuggestionsListDTO] = deriveEncoder
}
