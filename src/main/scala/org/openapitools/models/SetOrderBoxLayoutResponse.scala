package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.ApiResponseStatusType
import org.openapitools.models.OrderBoxesLayoutDTO

/**
 * 
 * @param status 
 * @param result 
 */
case class SetOrderBoxLayoutResponse(status: Option[ApiResponseStatusType],
                result: Option[OrderBoxesLayoutDTO]
                )

object SetOrderBoxLayoutResponse {
    /**
     * Creates the codec for converting SetOrderBoxLayoutResponse from and to JSON.
     */
    implicit val decoder: Decoder[SetOrderBoxLayoutResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[SetOrderBoxLayoutResponse] = deriveEncoder
}
