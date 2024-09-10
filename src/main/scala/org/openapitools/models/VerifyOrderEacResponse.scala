package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.ApiResponseStatusType
import org.openapitools.models.EacVerificationResultDTO

/**
 * 
 * @param status 
 * @param result 
 */
case class VerifyOrderEacResponse(status: Option[ApiResponseStatusType],
                result: Option[EacVerificationResultDTO]
                )

object VerifyOrderEacResponse {
    /**
     * Creates the codec for converting VerifyOrderEacResponse from and to JSON.
     */
    implicit val decoder: Decoder[VerifyOrderEacResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[VerifyOrderEacResponse] = deriveEncoder
}
