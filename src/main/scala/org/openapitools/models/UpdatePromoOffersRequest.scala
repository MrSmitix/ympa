package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.UpdatePromoOfferDTO
import scala.collection.immutable.Seq

/**
 * Добавление товаров в акцию или обновление их параметров.  Чтобы добавить товары в акцию или обновить параметры каких-то товаров, передайте их в параметре `offers`. 
 * @param promoId Идентификатор акции.
 * @param offers Товары, которые необходимо добавить в акцию или цены которых нужно изменить.
 */
case class UpdatePromoOffersRequest(promoId: String,
                offers: Seq[UpdatePromoOfferDTO]
                )

object UpdatePromoOffersRequest {
    /**
     * Creates the codec for converting UpdatePromoOffersRequest from and to JSON.
     */
    implicit val decoder: Decoder[UpdatePromoOffersRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[UpdatePromoOffersRequest] = deriveEncoder
}
