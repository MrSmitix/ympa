package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.CampaignDTO
import org.openapitools.models.FlippingPagerDTO
import scala.collection.immutable.Seq

/**
 * Результаты поиска магазинов.
 * @param campaigns Список с информацией по каждому магазину.
 * @param pager 
 */
case class GetCampaignsResponse(campaigns: Seq[CampaignDTO],
                pager: Option[FlippingPagerDTO]
                )

object GetCampaignsResponse {
    /**
     * Creates the codec for converting GetCampaignsResponse from and to JSON.
     */
    implicit val decoder: Decoder[GetCampaignsResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[GetCampaignsResponse] = deriveEncoder
}
