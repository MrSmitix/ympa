package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.OfferDTO
import scala.collection.immutable.Seq

/**
 * Список предложений.
 * @param offers Список предложений магазина.
 */
case class GetAllOffersResponse(offers: Seq[OfferDTO]
                )

object GetAllOffersResponse {
    /**
     * Creates the codec for converting GetAllOffersResponse from and to JSON.
     */
    implicit val decoder: Decoder[GetAllOffersResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[GetAllOffersResponse] = deriveEncoder
}
