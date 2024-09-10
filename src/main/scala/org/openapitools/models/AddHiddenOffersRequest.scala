package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.HiddenOfferDTO
import scala.collection.immutable.Seq

/**
 * Запрос на скрытие оферов.
 * @param hiddenOffers Список скрытых товаров. 
 */
case class AddHiddenOffersRequest(hiddenOffers: Seq[HiddenOfferDTO]
                )

object AddHiddenOffersRequest {
    /**
     * Creates the codec for converting AddHiddenOffersRequest from and to JSON.
     */
    implicit val decoder: Decoder[AddHiddenOffersRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[AddHiddenOffersRequest] = deriveEncoder
}
