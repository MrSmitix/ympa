package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import scala.collection.immutable.Seq

/**
 * Удаление товаров из акции.  Чтобы убрать:  * все товары из акции и больше не участвовать в ней, передайте значение `true` в параметре `deleteAllOffers`;  * часть товаров, передайте их идентификаторы в параметре `offersIds`. 
 * @param promoId Идентификатор акции.
 * @param deleteAllOffers Чтобы убрать все товары из акции и больше не участвовать в ней, передайте значение `true` и не передавайте параметр `offerIds`.
 * @param offerIds Товары, которые нужно убрать из акции.
 */
case class DeletePromoOffersRequest(promoId: String,
                deleteAllOffers: Option[Boolean],
                offerIds: Option[Seq[String]]
                )

object DeletePromoOffersRequest {
    /**
     * Creates the codec for converting DeletePromoOffersRequest from and to JSON.
     */
    implicit val decoder: Decoder[DeletePromoOffersRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[DeletePromoOffersRequest] = deriveEncoder
}
