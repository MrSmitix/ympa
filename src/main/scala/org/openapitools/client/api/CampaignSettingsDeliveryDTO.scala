package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CampaignSettingsDeliveryDTO._

case class CampaignSettingsDeliveryDTO (
  schedule: Option[CampaignSettingsScheduleDTO])

object CampaignSettingsDeliveryDTO {
  import DateTimeCodecs._

  implicit val CampaignSettingsDeliveryDTOCodecJson: CodecJson[CampaignSettingsDeliveryDTO] = CodecJson.derive[CampaignSettingsDeliveryDTO]
  implicit val CampaignSettingsDeliveryDTODecoder: EntityDecoder[CampaignSettingsDeliveryDTO] = jsonOf[CampaignSettingsDeliveryDTO]
  implicit val CampaignSettingsDeliveryDTOEncoder: EntityEncoder[CampaignSettingsDeliveryDTO] = jsonEncoderOf[CampaignSettingsDeliveryDTO]
}
