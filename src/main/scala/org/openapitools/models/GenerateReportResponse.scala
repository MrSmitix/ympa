package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.ApiResponseStatusType
import org.openapitools.models.GenerateReportDTO

/**
 * Ответ на запрос генерации отчета.
 * @param status 
 * @param result 
 */
case class GenerateReportResponse(status: Option[ApiResponseStatusType],
                result: Option[GenerateReportDTO]
                )

object GenerateReportResponse {
    /**
     * Creates the codec for converting GenerateReportResponse from and to JSON.
     */
    implicit val decoder: Decoder[GenerateReportResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[GenerateReportResponse] = deriveEncoder
}
