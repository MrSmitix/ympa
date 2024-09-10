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
 * @param dateFrom Начало периода, включительно.
 * @param dateTo Конец периода, включительно.
 */
case class GenerateBoostConsolidatedRequest(businessId: Long,
                dateFrom: LocalDateTime,
                dateTo: LocalDateTime
                )

object GenerateBoostConsolidatedRequest {
    /**
     * Creates the codec for converting GenerateBoostConsolidatedRequest from and to JSON.
     */
    implicit val decoder: Decoder[GenerateBoostConsolidatedRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[GenerateBoostConsolidatedRequest] = deriveEncoder
}
