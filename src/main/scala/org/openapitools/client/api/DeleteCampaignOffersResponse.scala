package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import DeleteCampaignOffersResponse._

case class DeleteCampaignOffersResponse (
  status: Option[ApiResponseStatusType],
result: Option[DeleteCampaignOffersDTO])

object DeleteCampaignOffersResponse {
  import DateTimeCodecs._

  implicit val DeleteCampaignOffersResponseCodecJson: CodecJson[DeleteCampaignOffersResponse] = CodecJson.derive[DeleteCampaignOffersResponse]
  implicit val DeleteCampaignOffersResponseDecoder: EntityDecoder[DeleteCampaignOffersResponse] = jsonOf[DeleteCampaignOffersResponse]
  implicit val DeleteCampaignOffersResponseEncoder: EntityEncoder[DeleteCampaignOffersResponse] = jsonEncoderOf[DeleteCampaignOffersResponse]
}
