package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.SuggestedOfferDTO
import scala.collection.immutable.Seq

/**
 * 
 * @param offers Список товаров.
 */
case class GetSuggestedOfferMappingsRequest(offers: Option[Seq[SuggestedOfferDTO]]
                )

object GetSuggestedOfferMappingsRequest {
    /**
     * Creates the codec for converting GetSuggestedOfferMappingsRequest from and to JSON.
     */
    implicit val decoder: Decoder[GetSuggestedOfferMappingsRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[GetSuggestedOfferMappingsRequest] = deriveEncoder
}
