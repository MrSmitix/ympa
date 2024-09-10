package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import java.time.LocalDateTime
import org.openapitools.models.ShowsSalesGroupingType

/**
 * Данные, необходимые для генерации отчета.
 * @param businessId Идентификатор бизнеса.  Указывается, если нужно составить отчет по всем магазинам бизнеса. В запросе обязательно должен быть либо `businessID`, либо `campaignId`, но не оба сразу. 
 * @param campaignId Идентификатор кампании.  Указывается, если нужно составить отчет по конкретному магазину. В запросе обязательно должен быть либо `businessID`, либо `campaignId`, но не оба сразу. 
 * @param dateFrom Начало периода, включительно.
 * @param dateTo Конец периода, включительно.
 * @param grouping 
 */
case class GenerateShowsSalesReportRequest(businessId: Option[Long],
                campaignId: Option[Long],
                dateFrom: LocalDateTime,
                dateTo: LocalDateTime,
                grouping: ShowsSalesGroupingType
                )

object GenerateShowsSalesReportRequest {
    /**
     * Creates the codec for converting GenerateShowsSalesReportRequest from and to JSON.
     */
    implicit val decoder: Decoder[GenerateShowsSalesReportRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[GenerateShowsSalesReportRequest] = deriveEncoder
}
