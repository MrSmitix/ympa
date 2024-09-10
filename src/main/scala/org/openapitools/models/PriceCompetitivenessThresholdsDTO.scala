package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.BasePriceDTO

/**
 * Максимальные значения цены, при которых она является привлекательной или умеренной.
 * @param optimalPrice 
 * @param averagePrice 
 */
case class PriceCompetitivenessThresholdsDTO(optimalPrice: Option[BasePriceDTO],
                averagePrice: Option[BasePriceDTO]
                )

object PriceCompetitivenessThresholdsDTO {
    /**
     * Creates the codec for converting PriceCompetitivenessThresholdsDTO from and to JSON.
     */
    implicit val decoder: Decoder[PriceCompetitivenessThresholdsDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[PriceCompetitivenessThresholdsDTO] = deriveEncoder
}
