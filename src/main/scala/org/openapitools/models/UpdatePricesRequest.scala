package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.OfferPriceDTO
import scala.collection.immutable.Seq

/**
 * Запрос на установку цен на товары.
 * @param offers Список товаров.
 */
case class UpdatePricesRequest(offers: Seq[OfferPriceDTO]
                )

object UpdatePricesRequest {
    /**
     * Creates the codec for converting UpdatePricesRequest from and to JSON.
     */
    implicit val decoder: Decoder[UpdatePricesRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[UpdatePricesRequest] = deriveEncoder
}
