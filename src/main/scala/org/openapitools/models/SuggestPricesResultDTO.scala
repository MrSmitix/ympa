package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.PriceSuggestOfferDTO
import scala.collection.immutable.Seq

/**
 * Результат запроса цен для продвижения.
 * @param offers Список товаров с ценами для продвижения.
 */
case class SuggestPricesResultDTO(offers: Seq[PriceSuggestOfferDTO]
                )

object SuggestPricesResultDTO {
    /**
     * Creates the codec for converting SuggestPricesResultDTO from and to JSON.
     */
    implicit val decoder: Decoder[SuggestPricesResultDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[SuggestPricesResultDTO] = deriveEncoder
}
