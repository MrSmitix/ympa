package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._

/**
 * Запрос отчета по товарам.
 * @param shopSkus Список ваших идентификаторов SKU. 
 */
case class GetGoodsStatsRequest(shopSkus: Set[String]
                )

object GetGoodsStatsRequest {
    /**
     * Creates the codec for converting GetGoodsStatsRequest from and to JSON.
     */
    implicit val decoder: Decoder[GetGoodsStatsRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[GetGoodsStatsRequest] = deriveEncoder
}
