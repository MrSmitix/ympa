package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._

/**
 * Параметры товара в акции с типом `DIRECT_DISCOUNT` или `BLUE_FLASH`.  Обязательный параметр для акций с этими типами. 
 * @param price Зачеркнутая цена — та, по которой товар продавался до акции.  Указывается в рублях.  Число должно быть целым. 
 * @param promoPrice Цена по акции — та, по которой вы хотите продавать товар.  Указывается в рублях.  Число должно быть целым. 
 */
case class UpdatePromoOfferDiscountParamsDTO(price: Option[Long],
                promoPrice: Option[Long]
                )

object UpdatePromoOfferDiscountParamsDTO {
    /**
     * Creates the codec for converting UpdatePromoOfferDiscountParamsDTO from and to JSON.
     */
    implicit val decoder: Decoder[UpdatePromoOfferDiscountParamsDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[UpdatePromoOfferDiscountParamsDTO] = deriveEncoder
}
