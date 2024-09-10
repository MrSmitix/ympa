package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import DeleteCampaignOffersDTO._

case class DeleteCampaignOffersDTO (
  /* Список SKU. */
  notDeletedOfferIds: Option[List[String]])

object DeleteCampaignOffersDTO {
  import DateTimeCodecs._

  implicit val DeleteCampaignOffersDTOCodecJson: CodecJson[DeleteCampaignOffersDTO] = CodecJson.derive[DeleteCampaignOffersDTO]
  implicit val DeleteCampaignOffersDTODecoder: EntityDecoder[DeleteCampaignOffersDTO] = jsonOf[DeleteCampaignOffersDTO]
  implicit val DeleteCampaignOffersDTOEncoder: EntityEncoder[DeleteCampaignOffersDTO] = jsonEncoderOf[DeleteCampaignOffersDTO]
}
