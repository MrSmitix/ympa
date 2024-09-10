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
 * Ошибка в данных переданных от клиента.
 * @param status 
 * @param errors Список ошибок.
 */
case class ApiClientDataErrorResponse(status: Option[ApiResponseStatusType],
                errors: Option[Seq[ApiErrorDTO]]
                )

object ApiClientDataErrorResponse {
    /**
     * Creates the codec for converting ApiClientDataErrorResponse from and to JSON.
     */
    implicit val decoder: Decoder[ApiClientDataErrorResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[ApiClientDataErrorResponse] = deriveEncoder
}
