package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.OfferSellingProgramStatusType
import org.openapitools.models.SellingProgramType

/**
 * Информация о том, по каким моделям можно продавать товар, а по каким нельзя.
 * @param sellingProgram 
 * @param status 
 */
case class OfferSellingProgramDTO(sellingProgram: SellingProgramType,
                status: OfferSellingProgramStatusType
                )

object OfferSellingProgramDTO {
    /**
     * Creates the codec for converting OfferSellingProgramDTO from and to JSON.
     */
    implicit val decoder: Decoder[OfferSellingProgramDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[OfferSellingProgramDTO] = deriveEncoder
}
