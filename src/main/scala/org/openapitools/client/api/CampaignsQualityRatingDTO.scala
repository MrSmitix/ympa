package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CampaignsQualityRatingDTO._

case class CampaignsQualityRatingDTO (
  /* Список магазинов c информацией об их индексе качества. */
  campaignRatings: List[CampaignQualityRatingDTO])

object CampaignsQualityRatingDTO {
  import DateTimeCodecs._

  implicit val CampaignsQualityRatingDTOCodecJson: CodecJson[CampaignsQualityRatingDTO] = CodecJson.derive[CampaignsQualityRatingDTO]
  implicit val CampaignsQualityRatingDTODecoder: EntityDecoder[CampaignsQualityRatingDTO] = jsonOf[CampaignsQualityRatingDTO]
  implicit val CampaignsQualityRatingDTOEncoder: EntityEncoder[CampaignsQualityRatingDTO] = jsonEncoderOf[CampaignsQualityRatingDTO]
}
