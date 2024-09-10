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
 * Ресурс из запроса заблокирован от применения к нему указанного метода.
 * @param status 
 * @param errors Список ошибок.
 */
case class ApiLockedErrorResponse(status: Option[ApiResponseStatusType],
                errors: Option[Seq[ApiErrorDTO]]
                )

object ApiLockedErrorResponse {
    /**
     * Creates the codec for converting ApiLockedErrorResponse from and to JSON.
     */
    implicit val decoder: Decoder[ApiLockedErrorResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[ApiLockedErrorResponse] = deriveEncoder
}
