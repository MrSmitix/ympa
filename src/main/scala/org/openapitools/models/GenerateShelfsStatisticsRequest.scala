package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import java.time.LocalDateTime
import org.openapitools.models.ShelfsStatisticsAttributionType

/**
 * Данные, необходимые для генерации отчета. 
 * @param businessId Идентификатор бизнеса.
 * @param dateFrom Начало периода, включительно.
 * @param dateTo Конец периода, включительно.
 * @param attributionType 
 */
case class GenerateShelfsStatisticsRequest(businessId: Long,
                dateFrom: LocalDateTime,
                dateTo: LocalDateTime,
                attributionType: ShelfsStatisticsAttributionType
                )

object GenerateShelfsStatisticsRequest {
    /**
     * Creates the codec for converting GenerateShelfsStatisticsRequest from and to JSON.
     */
    implicit val decoder: Decoder[GenerateShelfsStatisticsRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[GenerateShelfsStatisticsRequest] = deriveEncoder
}
