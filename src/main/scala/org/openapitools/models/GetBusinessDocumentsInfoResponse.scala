package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.ApiResponseStatusType
import org.openapitools.models.OrderBusinessDocumentsDTO

/**
 * 
 * @param status 
 * @param result 
 */
case class GetBusinessDocumentsInfoResponse(status: Option[ApiResponseStatusType],
                result: Option[OrderBusinessDocumentsDTO]
                )

object GetBusinessDocumentsInfoResponse {
    /**
     * Creates the codec for converting GetBusinessDocumentsInfoResponse from and to JSON.
     */
    implicit val decoder: Decoder[GetBusinessDocumentsInfoResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[GetBusinessDocumentsInfoResponse] = deriveEncoder
}
