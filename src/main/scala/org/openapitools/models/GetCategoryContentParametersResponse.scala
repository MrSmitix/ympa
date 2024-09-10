package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.ApiResponseStatusType
import org.openapitools.models.CategoryContentParametersDTO

/**
 * Ответ со списком характеристик для категории и их допустимыми значениями.
 * @param status 
 * @param result 
 */
case class GetCategoryContentParametersResponse(status: Option[ApiResponseStatusType],
                result: Option[CategoryContentParametersDTO]
                )

object GetCategoryContentParametersResponse {
    /**
     * Creates the codec for converting GetCategoryContentParametersResponse from and to JSON.
     */
    implicit val decoder: Decoder[GetCategoryContentParametersResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[GetCategoryContentParametersResponse] = deriveEncoder
}
