package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import java.time.LocalDateTime

/**
 * Данные, необходимые для генерации отчета.
 * @param businessId Идентификатор бизнеса.
 * @param categoryId Идентификатор категории.
 * @param dateFrom Начало периода, включительно.
 * @param dateTo Конец периода, включительно.
 */
case class GenerateCompetitorsPositionReportRequest(businessId: Long,
                categoryId: Long,
                dateFrom: LocalDateTime,
                dateTo: LocalDateTime
                )

object GenerateCompetitorsPositionReportRequest {
    /**
     * Creates the codec for converting GenerateCompetitorsPositionReportRequest from and to JSON.
     */
    implicit val decoder: Decoder[GenerateCompetitorsPositionReportRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[GenerateCompetitorsPositionReportRequest] = deriveEncoder
}
