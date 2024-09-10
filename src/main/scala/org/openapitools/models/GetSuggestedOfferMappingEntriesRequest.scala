package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.MappingsOfferDTO
import scala.collection.immutable.Seq

/**
 * Запрос рекомендованных карточек товара.
 * @param offers Список товаров.
 */
case class GetSuggestedOfferMappingEntriesRequest(offers: Seq[MappingsOfferDTO]
                )

object GetSuggestedOfferMappingEntriesRequest {
    /**
     * Creates the codec for converting GetSuggestedOfferMappingEntriesRequest from and to JSON.
     */
    implicit val decoder: Decoder[GetSuggestedOfferMappingEntriesRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[GetSuggestedOfferMappingEntriesRequest] = deriveEncoder
}
