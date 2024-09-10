package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import GetCampaignResponse._

case class GetCampaignResponse (
  campaign: Option[CampaignDTO])

object GetCampaignResponse {
  import DateTimeCodecs._

  implicit val GetCampaignResponseCodecJson: CodecJson[GetCampaignResponse] = CodecJson.derive[GetCampaignResponse]
  implicit val GetCampaignResponseDecoder: EntityDecoder[GetCampaignResponse] = jsonOf[GetCampaignResponse]
  implicit val GetCampaignResponseEncoder: EntityEncoder[GetCampaignResponse] = jsonEncoderOf[GetCampaignResponse]
}
