package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.ApiResponseStatusType
import org.openapitools.models.QualityRatingDetailsDTO

/**
 * 
 * @param status 
 * @param result 
 */
case class GetQualityRatingDetailsResponse(status: Option[ApiResponseStatusType],
                result: Option[QualityRatingDetailsDTO]
                )

object GetQualityRatingDetailsResponse {
    /**
     * Creates the codec for converting GetQualityRatingDetailsResponse from and to JSON.
     */
    implicit val decoder: Decoder[GetQualityRatingDetailsResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[GetQualityRatingDetailsResponse] = deriveEncoder
}
