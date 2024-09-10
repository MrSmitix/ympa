package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.ApiResponseStatusType
import org.openapitools.models.OrderLabelDTO

/**
 * Ответ с информацией для печати ярлыков.
 * @param status 
 * @param result 
 */
case class GetOrderLabelsDataResponse(status: Option[ApiResponseStatusType],
                result: Option[OrderLabelDTO]
                )

object GetOrderLabelsDataResponse {
    /**
     * Creates the codec for converting GetOrderLabelsDataResponse from and to JSON.
     */
    implicit val decoder: Decoder[GetOrderLabelsDataResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[GetOrderLabelsDataResponse] = deriveEncoder
}
