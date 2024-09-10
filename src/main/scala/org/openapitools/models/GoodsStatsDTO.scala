package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.GoodsStatsGoodsDTO
import scala.collection.immutable.Seq

/**
 * Отчет по товарам.
 * @param shopSkus Список товаров.
 */
case class GoodsStatsDTO(shopSkus: Seq[GoodsStatsGoodsDTO]
                )

object GoodsStatsDTO {
    /**
     * Creates the codec for converting GoodsStatsDTO from and to JSON.
     */
    implicit val decoder: Decoder[GoodsStatsDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[GoodsStatsDTO] = deriveEncoder
}
