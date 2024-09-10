package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.ApiResponseStatusType
import org.openapitools.models.SuggestPricesResultDTO

/**
 * Ответ на запрос списка цен для продвижения.
 * @param status 
 * @param result 
 */
case class SuggestPricesResponse(status: Option[ApiResponseStatusType],
                result: Option[SuggestPricesResultDTO]
                )

object SuggestPricesResponse {
    /**
     * Creates the codec for converting SuggestPricesResponse from and to JSON.
     */
    implicit val decoder: Decoder[SuggestPricesResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[SuggestPricesResponse] = deriveEncoder
}
