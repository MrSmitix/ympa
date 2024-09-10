package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.ApiResponseStatusType
import org.openapitools.models.CategoryDTO

/**
 * 
 * @param status 
 * @param result 
 */
case class GetCategoriesResponse(status: Option[ApiResponseStatusType],
                result: Option[CategoryDTO]
                )

object GetCategoriesResponse {
    /**
     * Creates the codec for converting GetCategoriesResponse from and to JSON.
     */
    implicit val decoder: Decoder[GetCategoriesResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[GetCategoriesResponse] = deriveEncoder
}
