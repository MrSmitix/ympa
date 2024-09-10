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
 * Неверны авторизационные данные, указанные в запросе, или запрещен доступ к запрашиваемому ресурсу.
 * @param status 
 * @param errors Список ошибок.
 */
case class ApiForbiddenErrorResponse(status: Option[ApiResponseStatusType],
                errors: Option[Seq[ApiErrorDTO]]
                )

object ApiForbiddenErrorResponse {
    /**
     * Creates the codec for converting ApiForbiddenErrorResponse from and to JSON.
     */
    implicit val decoder: Decoder[ApiForbiddenErrorResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[ApiForbiddenErrorResponse] = deriveEncoder
}
