package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.PriceQuarantineVerdictParamNameType

/**
 * Параметр карантина.
 * @param name 
 * @param value Значение параметра.
 */
case class PriceQuarantineVerdictParameterDTO(name: PriceQuarantineVerdictParamNameType,
                value: String
                )

object PriceQuarantineVerdictParameterDTO {
    /**
     * Creates the codec for converting PriceQuarantineVerdictParameterDTO from and to JSON.
     */
    implicit val decoder: Decoder[PriceQuarantineVerdictParameterDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[PriceQuarantineVerdictParameterDTO] = deriveEncoder
}
