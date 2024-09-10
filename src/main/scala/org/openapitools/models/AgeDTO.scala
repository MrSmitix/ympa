package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.AgeUnitType
import org.openapitools.models.BigDecimal

/**
 * Возраст в заданных единицах измерения.
 * @param value Значение. 
 * @param ageUnit 
 */
case class AgeDTO(value: BigDecimal,
                ageUnit: AgeUnitType
                )

object AgeDTO {
    /**
     * Creates the codec for converting AgeDTO from and to JSON.
     */
    implicit val decoder: Decoder[AgeDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[AgeDTO] = deriveEncoder
}
