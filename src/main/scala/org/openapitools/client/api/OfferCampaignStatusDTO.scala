package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import OfferCampaignStatusDTO._

case class OfferCampaignStatusDTO (
  /* Идентификатор кампании.  */
  campaignId: Long,
status: OfferCampaignStatusType)

object OfferCampaignStatusDTO {
  import DateTimeCodecs._

  implicit val OfferCampaignStatusDTOCodecJson: CodecJson[OfferCampaignStatusDTO] = CodecJson.derive[OfferCampaignStatusDTO]
  implicit val OfferCampaignStatusDTODecoder: EntityDecoder[OfferCampaignStatusDTO] = jsonOf[OfferCampaignStatusDTO]
  implicit val OfferCampaignStatusDTOEncoder: EntityEncoder[OfferCampaignStatusDTO] = jsonEncoderOf[OfferCampaignStatusDTO]
}
