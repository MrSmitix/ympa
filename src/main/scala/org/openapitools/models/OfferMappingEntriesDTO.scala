package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.OfferMappingEntryDTO
import org.openapitools.models.ScrollingPagerDTO
import scala.collection.immutable.Seq

/**
 * Информация о товарах в каталоге.
 * @param paging 
 * @param offerMappingEntries Информация о товарах в каталоге.
 */
case class OfferMappingEntriesDTO(paging: Option[ScrollingPagerDTO],
                offerMappingEntries: Seq[OfferMappingEntryDTO]
                )

object OfferMappingEntriesDTO {
    /**
     * Creates the codec for converting OfferMappingEntriesDTO from and to JSON.
     */
    implicit val decoder: Decoder[OfferMappingEntriesDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[OfferMappingEntriesDTO] = deriveEncoder
}
