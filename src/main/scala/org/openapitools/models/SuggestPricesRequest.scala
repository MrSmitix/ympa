package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.SuggestOfferPriceDTO
import scala.collection.immutable.Seq

/**
 * Запрос на получение списка цен для продвижения.
 * @param offers Список товаров.
 */
case class SuggestPricesRequest(offers: Seq[SuggestOfferPriceDTO]
                )

object SuggestPricesRequest {
    /**
     * Creates the codec for converting SuggestPricesRequest from and to JSON.
     */
    implicit val decoder: Decoder[SuggestPricesRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[SuggestPricesRequest] = deriveEncoder
}
