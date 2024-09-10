package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.CalculateTariffsOfferInfoDTO
import scala.collection.immutable.Seq

/**
 * Расчет стоимости услуг.
 * @param offers Стоимость услуг.
 */
case class CalculateTariffsResponseDTO(offers: Seq[CalculateTariffsOfferInfoDTO]
                )

object CalculateTariffsResponseDTO {
    /**
     * Creates the codec for converting CalculateTariffsResponseDTO from and to JSON.
     */
    implicit val decoder: Decoder[CalculateTariffsResponseDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[CalculateTariffsResponseDTO] = deriveEncoder
}
