package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.HiddenOfferDTO
import scala.collection.immutable.Seq

/**
 * Запрос на возобновление показа оферов.
 * @param hiddenOffers Список скрытых товаров. 
 */
case class DeleteHiddenOffersRequest(hiddenOffers: Seq[HiddenOfferDTO]
                )

object DeleteHiddenOffersRequest {
    /**
     * Creates the codec for converting DeleteHiddenOffersRequest from and to JSON.
     */
    implicit val decoder: Decoder[DeleteHiddenOffersRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[DeleteHiddenOffersRequest] = deriveEncoder
}
