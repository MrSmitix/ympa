package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import scala.collection.immutable.Seq

/**
 * Ответ на запрос списка логинов, связанных с магазином.
 * @param logins Список логинов.
 */
case class GetCampaignLoginsResponse(logins: Seq[String]
                )

object GetCampaignLoginsResponse {
    /**
     * Creates the codec for converting GetCampaignLoginsResponse from and to JSON.
     */
    implicit val decoder: Decoder[GetCampaignLoginsResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[GetCampaignLoginsResponse] = deriveEncoder
}
