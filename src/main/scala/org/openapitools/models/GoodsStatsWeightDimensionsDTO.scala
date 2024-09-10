package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.BigDecimal

/**
 * Информация о весе и габаритах товара.  Если товар уже привязан к карточке (`marketSku`), в ответе вернутся габариты из карточки Маркета, а не размеры, которые вы передаете. 
 * @param length Длина товара в сантиметрах.
 * @param width Ширина товара в сантиметрах.
 * @param height Высота товара в сантиметрах.
 * @param weight Вес товара в килограммах.
 */
case class GoodsStatsWeightDimensionsDTO(length: Option[BigDecimal],
                width: Option[BigDecimal],
                height: Option[BigDecimal],
                weight: Option[BigDecimal]
                )

object GoodsStatsWeightDimensionsDTO {
    /**
     * Creates the codec for converting GoodsStatsWeightDimensionsDTO from and to JSON.
     */
    implicit val decoder: Decoder[GoodsStatsWeightDimensionsDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[GoodsStatsWeightDimensionsDTO] = deriveEncoder
}
