package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import GetCampaignLoginsResponse._

case class GetCampaignLoginsResponse (
  /* Список логинов. */
  logins: List[String])

object GetCampaignLoginsResponse {
  import DateTimeCodecs._

  implicit val GetCampaignLoginsResponseCodecJson: CodecJson[GetCampaignLoginsResponse] = CodecJson.derive[GetCampaignLoginsResponse]
  implicit val GetCampaignLoginsResponseDecoder: EntityDecoder[GetCampaignLoginsResponse] = jsonOf[GetCampaignLoginsResponse]
  implicit val GetCampaignLoginsResponseEncoder: EntityEncoder[GetCampaignLoginsResponse] = jsonEncoderOf[GetCampaignLoginsResponse]
}
