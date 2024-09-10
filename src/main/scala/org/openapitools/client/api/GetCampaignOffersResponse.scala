package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import GetCampaignOffersResponse._

case class GetCampaignOffersResponse (
  status: Option[ApiResponseStatusType],
result: Option[GetCampaignOffersResultDTO])

object GetCampaignOffersResponse {
  import DateTimeCodecs._

  implicit val GetCampaignOffersResponseCodecJson: CodecJson[GetCampaignOffersResponse] = CodecJson.derive[GetCampaignOffersResponse]
  implicit val GetCampaignOffersResponseDecoder: EntityDecoder[GetCampaignOffersResponse] = jsonOf[GetCampaignOffersResponse]
  implicit val GetCampaignOffersResponseEncoder: EntityEncoder[GetCampaignOffersResponse] = jsonEncoderOf[GetCampaignOffersResponse]
}
