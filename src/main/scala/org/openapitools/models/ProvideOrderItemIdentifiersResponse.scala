package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.ApiResponseStatusType
import org.openapitools.models.OrderItemsModificationResultDTO

/**
 * 
 * @param status 
 * @param result 
 */
case class ProvideOrderItemIdentifiersResponse(status: Option[ApiResponseStatusType],
                result: Option[OrderItemsModificationResultDTO]
                )

object ProvideOrderItemIdentifiersResponse {
    /**
     * Creates the codec for converting ProvideOrderItemIdentifiersResponse from and to JSON.
     */
    implicit val decoder: Decoder[ProvideOrderItemIdentifiersResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[ProvideOrderItemIdentifiersResponse] = deriveEncoder
}
