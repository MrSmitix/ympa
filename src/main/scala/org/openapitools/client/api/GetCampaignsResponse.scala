package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import GetCampaignsResponse._

case class GetCampaignsResponse (
  /* Список с информацией по каждому магазину. */
  campaigns: List[CampaignDTO],
pager: Option[FlippingPagerDTO])

object GetCampaignsResponse {
  import DateTimeCodecs._

  implicit val GetCampaignsResponseCodecJson: CodecJson[GetCampaignsResponse] = CodecJson.derive[GetCampaignsResponse]
  implicit val GetCampaignsResponseDecoder: EntityDecoder[GetCampaignsResponse] = jsonOf[GetCampaignsResponse]
  implicit val GetCampaignsResponseEncoder: EntityEncoder[GetCampaignsResponse] = jsonEncoderOf[GetCampaignsResponse]
}
