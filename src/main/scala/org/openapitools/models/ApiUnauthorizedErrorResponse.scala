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
 * В запросе не указаны авторизационные данные.
 * @param status 
 * @param errors Список ошибок.
 */
case class ApiUnauthorizedErrorResponse(status: Option[ApiResponseStatusType],
                errors: Option[Seq[ApiErrorDTO]]
                )

object ApiUnauthorizedErrorResponse {
    /**
     * Creates the codec for converting ApiUnauthorizedErrorResponse from and to JSON.
     */
    implicit val decoder: Decoder[ApiUnauthorizedErrorResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[ApiUnauthorizedErrorResponse] = deriveEncoder
}
