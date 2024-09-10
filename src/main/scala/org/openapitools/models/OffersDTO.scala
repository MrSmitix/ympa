package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.OfferDTO
import scala.collection.immutable.Seq

/**
 * Найденные предложения магазина.
 * @param offers Список предложений магазина.
 */
case class OffersDTO(offers: Seq[OfferDTO]
                )

object OffersDTO {
    /**
     * Creates the codec for converting OffersDTO from and to JSON.
     */
    implicit val decoder: Decoder[OffersDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[OffersDTO] = deriveEncoder
}
