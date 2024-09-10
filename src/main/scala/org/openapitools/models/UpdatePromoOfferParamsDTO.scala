package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.UpdatePromoOfferDiscountParamsDTO

/**
 * Параметры товара, который участвует в акции.
 * @param discountParams 
 */
case class UpdatePromoOfferParamsDTO(discountParams: Option[UpdatePromoOfferDiscountParamsDTO]
                )

object UpdatePromoOfferParamsDTO {
    /**
     * Creates the codec for converting UpdatePromoOfferParamsDTO from and to JSON.
     */
    implicit val decoder: Decoder[UpdatePromoOfferParamsDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[UpdatePromoOfferParamsDTO] = deriveEncoder
}
