package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.UpdateCampaignOfferDTO
import scala.collection.immutable.Seq

/**
 * Запрос на обновление предложений товаров магазина.
 * @param offers Параметры размещения товаров в заданном магазине.
 */
case class UpdateCampaignOffersRequest(offers: Seq[UpdateCampaignOfferDTO]
                )

object UpdateCampaignOffersRequest {
    /**
     * Creates the codec for converting UpdateCampaignOffersRequest from and to JSON.
     */
    implicit val decoder: Decoder[UpdateCampaignOffersRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[UpdateCampaignOffersRequest] = deriveEncoder
}
