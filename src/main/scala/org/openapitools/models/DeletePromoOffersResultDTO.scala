package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.RejectedPromoOfferDeleteDTO
import scala.collection.immutable.Seq

/**
 * Результат удаления товаров из акции.  Возвращается, только если в запросе был передан параметр `offerIds`. 
 * @param rejectedOffers Товары, при удалении которых появились ошибки.  Возвращается, только если есть такие товары. 
 */
case class DeletePromoOffersResultDTO(rejectedOffers: Option[Seq[RejectedPromoOfferDeleteDTO]]
                )

object DeletePromoOffersResultDTO {
    /**
     * Creates the codec for converting DeletePromoOffersResultDTO from and to JSON.
     */
    implicit val decoder: Decoder[DeletePromoOffersResultDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[DeletePromoOffersResultDTO] = deriveEncoder
}
