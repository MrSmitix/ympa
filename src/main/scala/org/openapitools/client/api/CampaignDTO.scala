package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CampaignDTO._

case class CampaignDTO (
  /* URL магазина. */
  domain: Option[String],
/* Идентификатор кампании. */
  id: Option[Long],
/* Идентификатор плательщика в Яндекс Балансе. */
  clientId: Option[Long],
business: Option[BusinessDTO],
placementType: Option[PlacementType])

object CampaignDTO {
  import DateTimeCodecs._

  implicit val CampaignDTOCodecJson: CodecJson[CampaignDTO] = CodecJson.derive[CampaignDTO]
  implicit val CampaignDTODecoder: EntityDecoder[CampaignDTO] = jsonOf[CampaignDTO]
  implicit val CampaignDTOEncoder: EntityEncoder[CampaignDTO] = jsonEncoderOf[CampaignDTO]
}
