package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.ApiResponseStatusType
import org.openapitools.models.ReportInfoDTO

/**
 * Ответ на запрос информации об отчете.
 * @param status 
 * @param result 
 */
case class GetReportInfoResponse(status: Option[ApiResponseStatusType],
                result: Option[ReportInfoDTO]
                )

object GetReportInfoResponse {
    /**
     * Creates the codec for converting GetReportInfoResponse from and to JSON.
     */
    implicit val decoder: Decoder[GetReportInfoResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[GetReportInfoResponse] = deriveEncoder
}
