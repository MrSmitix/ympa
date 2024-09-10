package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.ApiResponseStatusType
import org.openapitools.models.DeleteOffersDTO

/**
 * Результат удаления товаров.
 * @param status 
 * @param result 
 */
case class DeleteOffersResponse(status: Option[ApiResponseStatusType],
                result: Option[DeleteOffersDTO]
                )

object DeleteOffersResponse {
    /**
     * Creates the codec for converting DeleteOffersResponse from and to JSON.
     */
    implicit val decoder: Decoder[DeleteOffersResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[DeleteOffersResponse] = deriveEncoder
}
