package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import scala.collection.immutable.Seq

/**
 * Фильтрации удаляемых товаров по offerIds. 
 * @param offerIds Идентификаторы товаров в каталоге.
 */
case class DeleteCampaignOffersRequest(offerIds: Seq[String]
                )

object DeleteCampaignOffersRequest {
    /**
     * Creates the codec for converting DeleteCampaignOffersRequest from and to JSON.
     */
    implicit val decoder: Decoder[DeleteCampaignOffersRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[DeleteCampaignOffersRequest] = deriveEncoder
}
