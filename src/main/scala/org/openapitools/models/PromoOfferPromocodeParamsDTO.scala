package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._

/**
 * Параметры товара в акции с типом `MARKET_PROMOCODE`.
 * @param maxPrice Максимально возможная цена для участия в акции до применения промокода.  Указывается в рублях.  Возвращается для всех товаров. 
 */
case class PromoOfferPromocodeParamsDTO(maxPrice: Long
                )

object PromoOfferPromocodeParamsDTO {
    /**
     * Creates the codec for converting PromoOfferPromocodeParamsDTO from and to JSON.
     */
    implicit val decoder: Decoder[PromoOfferPromocodeParamsDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[PromoOfferPromocodeParamsDTO] = deriveEncoder
}
