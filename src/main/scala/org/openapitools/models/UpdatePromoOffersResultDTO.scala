package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.RejectedPromoOfferUpdateDTO
import org.openapitools.models.WarningPromoOfferUpdateDTO
import scala.collection.immutable.Seq

/**
 * Ошибки и предупреждения, которые появились при добавлении товаров в акцию.
 * @param rejectedOffers Изменения, которые были отклонены.  Возвращается, только если есть отклоненные изменения. 
 * @param warningOffers Изменения, по которым есть предупреждения. Они информируют о возможных проблемах. Информация о товарах обновится.  Возвращается, только если есть предупреждения. 
 */
case class UpdatePromoOffersResultDTO(rejectedOffers: Option[Seq[RejectedPromoOfferUpdateDTO]],
                warningOffers: Option[Seq[WarningPromoOfferUpdateDTO]]
                )

object UpdatePromoOffersResultDTO {
    /**
     * Creates the codec for converting UpdatePromoOffersResultDTO from and to JSON.
     */
    implicit val decoder: Decoder[UpdatePromoOffersResultDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[UpdatePromoOffersResultDTO] = deriveEncoder
}
