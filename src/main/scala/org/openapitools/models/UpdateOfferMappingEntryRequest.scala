package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.UpdateOfferMappingEntryDTO
import scala.collection.immutable.Seq

/**
 * Запрос на обновление товаров.
 * @param offerMappingEntries Информация о товарах в каталоге.
 */
case class UpdateOfferMappingEntryRequest(offerMappingEntries: Seq[UpdateOfferMappingEntryDTO]
                )

object UpdateOfferMappingEntryRequest {
    /**
     * Creates the codec for converting UpdateOfferMappingEntryRequest from and to JSON.
     */
    implicit val decoder: Decoder[UpdateOfferMappingEntryRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[UpdateOfferMappingEntryRequest] = deriveEncoder
}
