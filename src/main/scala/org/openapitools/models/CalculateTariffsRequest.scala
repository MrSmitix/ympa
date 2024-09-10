package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.CalculateTariffsOfferDTO
import org.openapitools.models.CalculateTariffsParametersDTO
import scala.collection.immutable.Seq

/**
 * 
 * @param parameters 
 * @param offers Товары, для которых нужно рассчитать стоимость услуг.
 */
case class CalculateTariffsRequest(parameters: CalculateTariffsParametersDTO,
                offers: Seq[CalculateTariffsOfferDTO]
                )

object CalculateTariffsRequest {
    /**
     * Creates the codec for converting CalculateTariffsRequest from and to JSON.
     */
    implicit val decoder: Decoder[CalculateTariffsRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[CalculateTariffsRequest] = deriveEncoder
}
