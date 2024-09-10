package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.UpdateBusinessOfferPriceDTO
import scala.collection.immutable.Seq

/**
 * Запрос на установку базовых цен на товары.
 * @param offers Список товаров с ценами.
 */
case class UpdateBusinessPricesRequest(offers: Seq[UpdateBusinessOfferPriceDTO]
                )

object UpdateBusinessPricesRequest {
    /**
     * Creates the codec for converting UpdateBusinessPricesRequest from and to JSON.
     */
    implicit val decoder: Decoder[UpdateBusinessPricesRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[UpdateBusinessPricesRequest] = deriveEncoder
}
