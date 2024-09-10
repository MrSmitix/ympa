package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.SuggestedOfferMappingDTO
import scala.collection.immutable.Seq

/**
 * Подобранные карточки на Маркете.
 * @param offers Список товаров.
 */
case class GetSuggestedOfferMappingsResultDTO(offers: Seq[SuggestedOfferMappingDTO]
                )

object GetSuggestedOfferMappingsResultDTO {
    /**
     * Creates the codec for converting GetSuggestedOfferMappingsResultDTO from and to JSON.
     */
    implicit val decoder: Decoder[GetSuggestedOfferMappingsResultDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[GetSuggestedOfferMappingsResultDTO] = deriveEncoder
}
