package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import GetCampaignSettingsResponse._

case class GetCampaignSettingsResponse (
  settings: Option[CampaignSettingsDTO])

object GetCampaignSettingsResponse {
  import DateTimeCodecs._

  implicit val GetCampaignSettingsResponseCodecJson: CodecJson[GetCampaignSettingsResponse] = CodecJson.derive[GetCampaignSettingsResponse]
  implicit val GetCampaignSettingsResponseDecoder: EntityDecoder[GetCampaignSettingsResponse] = jsonOf[GetCampaignSettingsResponse]
  implicit val GetCampaignSettingsResponseEncoder: EntityEncoder[GetCampaignSettingsResponse] = jsonEncoderOf[GetCampaignSettingsResponse]
}
