package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import GetCampaignOffersResultDTO._

case class GetCampaignOffersResultDTO (
  paging: Option[ScrollingPagerDTO],
/* Страница списка товаров. */
  offers: List[GetCampaignOfferDTO])

object GetCampaignOffersResultDTO {
  import DateTimeCodecs._

  implicit val GetCampaignOffersResultDTOCodecJson: CodecJson[GetCampaignOffersResultDTO] = CodecJson.derive[GetCampaignOffersResultDTO]
  implicit val GetCampaignOffersResultDTODecoder: EntityDecoder[GetCampaignOffersResultDTO] = jsonOf[GetCampaignOffersResultDTO]
  implicit val GetCampaignOffersResultDTOEncoder: EntityEncoder[GetCampaignOffersResultDTO] = jsonEncoderOf[GetCampaignOffersResultDTO]
}
