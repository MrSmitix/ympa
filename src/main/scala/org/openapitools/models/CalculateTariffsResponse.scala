package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.ApiResponseStatusType
import org.openapitools.models.CalculateTariffsResponseDTO

/**
 * 
 * @param status 
 * @param result 
 */
case class CalculateTariffsResponse(status: Option[ApiResponseStatusType],
                result: Option[CalculateTariffsResponseDTO]
                )

object CalculateTariffsResponse {
    /**
     * Creates the codec for converting CalculateTariffsResponse from and to JSON.
     */
    implicit val decoder: Decoder[CalculateTariffsResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[CalculateTariffsResponse] = deriveEncoder
}
