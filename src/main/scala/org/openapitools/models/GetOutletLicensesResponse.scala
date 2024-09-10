package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.ApiResponseStatusType
import org.openapitools.models.OutletLicensesResponseDTO

/**
 * 
 * @param status 
 * @param result 
 */
case class GetOutletLicensesResponse(status: Option[ApiResponseStatusType],
                result: Option[OutletLicensesResponseDTO]
                )

object GetOutletLicensesResponse {
    /**
     * Creates the codec for converting GetOutletLicensesResponse from and to JSON.
     */
    implicit val decoder: Decoder[GetOutletLicensesResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[GetOutletLicensesResponse] = deriveEncoder
}
