package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._

/**
 * Параметры товара в акции с типом `DIRECT_DISCOUNT` или `BLUE_FLASH`.
 * @param price Зачеркнутая цена — та, по которой товар продавался до акции.  Указывается в рублях.  Возвращается, только если товар участвует в акции. 
 * @param promoPrice Цена по акции — та, по которой вы хотите продавать товар.  Указывается в рублях.  Возвращается, только если товар участвует в акции. 
 * @param maxPromoPrice Максимально возможная цена для участия в акции.  Указывается в рублях.  Возвращается для всех товаров. 
 */
case class PromoOfferDiscountParamsDTO(price: Option[Long],
                promoPrice: Option[Long],
                maxPromoPrice: Long
                )

object PromoOfferDiscountParamsDTO {
    /**
     * Creates the codec for converting PromoOfferDiscountParamsDTO from and to JSON.
     */
    implicit val decoder: Decoder[PromoOfferDiscountParamsDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[PromoOfferDiscountParamsDTO] = deriveEncoder
}
