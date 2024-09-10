package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import UpdateCampaignOffersRequest._

case class UpdateCampaignOffersRequest (
  /* Параметры размещения товаров в заданном магазине. */
  offers: List[UpdateCampaignOfferDTO])

object UpdateCampaignOffersRequest {
  import DateTimeCodecs._

  implicit val UpdateCampaignOffersRequestCodecJson: CodecJson[UpdateCampaignOffersRequest] = CodecJson.derive[UpdateCampaignOffersRequest]
  implicit val UpdateCampaignOffersRequestDecoder: EntityDecoder[UpdateCampaignOffersRequest] = jsonOf[UpdateCampaignOffersRequest]
  implicit val UpdateCampaignOffersRequestEncoder: EntityEncoder[UpdateCampaignOffersRequest] = jsonEncoderOf[UpdateCampaignOffersRequest]
}
