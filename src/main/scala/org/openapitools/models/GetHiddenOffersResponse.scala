package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.ApiResponseStatusType
import org.openapitools.models.GetHiddenOffersResultDTO

/**
 * Ответ на запрос списка скрытий.
 * @param status 
 * @param result 
 */
case class GetHiddenOffersResponse(status: Option[ApiResponseStatusType],
                result: Option[GetHiddenOffersResultDTO]
                )

object GetHiddenOffersResponse {
    /**
     * Creates the codec for converting GetHiddenOffersResponse from and to JSON.
     */
    implicit val decoder: Decoder[GetHiddenOffersResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[GetHiddenOffersResponse] = deriveEncoder
}
