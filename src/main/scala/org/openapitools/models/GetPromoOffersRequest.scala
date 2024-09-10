package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.PromoOfferParticipationStatusFilterType

/**
 * Получение списка товаров, которые участвуют или могут участвовать в акции.
 * @param promoId Идентификатор акции.
 * @param statusType 
 */
case class GetPromoOffersRequest(promoId: String,
                statusType: Option[PromoOfferParticipationStatusFilterType]
                )

object GetPromoOffersRequest {
    /**
     * Creates the codec for converting GetPromoOffersRequest from and to JSON.
     */
    implicit val decoder: Decoder[GetPromoOffersRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[GetPromoOffersRequest] = deriveEncoder
}
