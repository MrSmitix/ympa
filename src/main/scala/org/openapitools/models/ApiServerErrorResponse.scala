package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.ApiErrorDTO
import org.openapitools.models.ApiResponseStatusType
import scala.collection.immutable.Seq

/**
 * Внутренняя ошибка сервера.
 * @param status 
 * @param errors Список ошибок.
 */
case class ApiServerErrorResponse(status: Option[ApiResponseStatusType],
                errors: Option[Seq[ApiErrorDTO]]
                )

object ApiServerErrorResponse {
    /**
     * Creates the codec for converting ApiServerErrorResponse from and to JSON.
     */
    implicit val decoder: Decoder[ApiServerErrorResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[ApiServerErrorResponse] = deriveEncoder
}
