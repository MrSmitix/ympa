package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._

/**
 * Данные, необходимые для генерации отчета: идентификатор магазина и период, за который нужен отчет. 
 * @param campaignId Идентификатор кампании.
 * @param year Год.
 * @param month Номер месяца.
 */
case class GenerateGoodsRealizationReportRequest(campaignId: Long,
                year: Int,
                month: Int
                )

object GenerateGoodsRealizationReportRequest {
    /**
     * Creates the codec for converting GenerateGoodsRealizationReportRequest from and to JSON.
     */
    implicit val decoder: Decoder[GenerateGoodsRealizationReportRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[GenerateGoodsRealizationReportRequest] = deriveEncoder
}
