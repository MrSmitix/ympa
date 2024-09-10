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
 * Превышено ограничение на доступ к ресурсу.
 * @param status 
 * @param errors Список ошибок.
 */
case class ApiLimitErrorResponse(status: Option[ApiResponseStatusType],
                errors: Option[Seq[ApiErrorDTO]]
                )

object ApiLimitErrorResponse {
    /**
     * Creates the codec for converting ApiLimitErrorResponse from and to JSON.
     */
    implicit val decoder: Decoder[ApiLimitErrorResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[ApiLimitErrorResponse] = deriveEncoder
}
