package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.PromoOfferDiscountParamsDTO
import org.openapitools.models.PromoOfferPromocodeParamsDTO

/**
 * Параметры товара в акции.  Возвращается параметр, который соответствует типу акции. 
 * @param discountParams 
 * @param promocodeParams 
 */
case class PromoOfferParamsDTO(discountParams: Option[PromoOfferDiscountParamsDTO],
                promocodeParams: Option[PromoOfferPromocodeParamsDTO]
                )

object PromoOfferParamsDTO {
    /**
     * Creates the codec for converting PromoOfferParamsDTO from and to JSON.
     */
    implicit val decoder: Decoder[PromoOfferParamsDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[PromoOfferParamsDTO] = deriveEncoder
}
