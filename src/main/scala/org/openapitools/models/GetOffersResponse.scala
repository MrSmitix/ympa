package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.FlippingPagerDTO
import org.openapitools.models.OfferDTO
import scala.collection.immutable.Seq

/**
 * Список предложений с пагинатором.
 * @param offers Список предложений магазина.
 * @param pager 
 */
case class GetOffersResponse(offers: Seq[OfferDTO],
                pager: Option[FlippingPagerDTO]
                )

object GetOffersResponse {
    /**
     * Creates the codec for converting GetOffersResponse from and to JSON.
     */
    implicit val decoder: Decoder[GetOffersResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[GetOffersResponse] = deriveEncoder
}
