package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CampaignSettingsLocalRegionDTO._

case class CampaignSettingsLocalRegionDTO (
  /* Идентификатор региона. */
  id: Option[Long],
/* Название региона. */
  name: Option[String],
`type`: Option[RegionType],
deliveryOptionsSource: Option[CampaignSettingsScheduleSourceType],
delivery: Option[CampaignSettingsDeliveryDTO])

object CampaignSettingsLocalRegionDTO {
  import DateTimeCodecs._

  implicit val CampaignSettingsLocalRegionDTOCodecJson: CodecJson[CampaignSettingsLocalRegionDTO] = CodecJson.derive[CampaignSettingsLocalRegionDTO]
  implicit val CampaignSettingsLocalRegionDTODecoder: EntityDecoder[CampaignSettingsLocalRegionDTO] = jsonOf[CampaignSettingsLocalRegionDTO]
  implicit val CampaignSettingsLocalRegionDTOEncoder: EntityEncoder[CampaignSettingsLocalRegionDTO] = jsonEncoderOf[CampaignSettingsLocalRegionDTO]
}
