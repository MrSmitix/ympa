package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.ApiResponseStatusType
import org.openapitools.models.GoodsFeedbackListDTO

/**
 * 
 * @param status 
 * @param result 
 */
case class GetGoodsFeedbackResponse(status: Option[ApiResponseStatusType],
                result: Option[GoodsFeedbackListDTO]
                )

object GetGoodsFeedbackResponse {
    /**
     * Creates the codec for converting GetGoodsFeedbackResponse from and to JSON.
     */
    implicit val decoder: Decoder[GetGoodsFeedbackResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[GetGoodsFeedbackResponse] = deriveEncoder
}
