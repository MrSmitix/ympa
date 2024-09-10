package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.ApiResponseStatusType
import org.openapitools.models.GoodsStatsDTO

/**
 * Ответ на запрос отчета по товарам.
 * @param status 
 * @param result 
 */
case class GetGoodsStatsResponse(status: Option[ApiResponseStatusType],
                result: Option[GoodsStatsDTO]
                )

object GetGoodsStatsResponse {
    /**
     * Creates the codec for converting GetGoodsStatsResponse from and to JSON.
     */
    implicit val decoder: Decoder[GetGoodsStatsResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[GetGoodsStatsResponse] = deriveEncoder
}
