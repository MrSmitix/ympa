package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._

/**
 * Информация для типа `MARKET_PROMOCODE`.  Параметр заполняется только для этого типа акции. 
 * @param promocode Промокод.
 * @param discount Процент скидки по промокоду.
 */
case class GetPromoPromocodeInfoDTO(promocode: String,
                discount: Int
                )

object GetPromoPromocodeInfoDTO {
    /**
     * Creates the codec for converting GetPromoPromocodeInfoDTO from and to JSON.
     */
    implicit val decoder: Decoder[GetPromoPromocodeInfoDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[GetPromoPromocodeInfoDTO] = deriveEncoder
}
