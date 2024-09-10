package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.ApiResponseStatusType
import org.openapitools.models.OfferCardsContentStatusDTO

/**
 * Ответ со списком состояний товаров и пагинацией.
 * @param status 
 * @param result 
 */
case class GetOfferCardsContentStatusResponse(status: Option[ApiResponseStatusType],
                result: Option[OfferCardsContentStatusDTO]
                )

object GetOfferCardsContentStatusResponse {
    /**
     * Creates the codec for converting GetOfferCardsContentStatusResponse from and to JSON.
     */
    implicit val decoder: Decoder[GetOfferCardsContentStatusResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[GetOfferCardsContentStatusResponse] = deriveEncoder
}
