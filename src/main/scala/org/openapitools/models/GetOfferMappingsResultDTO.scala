package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.GetOfferMappingDTO
import org.openapitools.models.ScrollingPagerDTO
import scala.collection.immutable.Seq

/**
 * Информация о товарах.
 * @param paging 
 * @param offerMappings Информация о товарах.
 */
case class GetOfferMappingsResultDTO(paging: Option[ScrollingPagerDTO],
                offerMappings: Seq[GetOfferMappingDTO]
                )

object GetOfferMappingsResultDTO {
    /**
     * Creates the codec for converting GetOfferMappingsResultDTO from and to JSON.
     */
    implicit val decoder: Decoder[GetOfferMappingsResultDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[GetOfferMappingsResultDTO] = deriveEncoder
}
