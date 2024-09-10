package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CampaignQualityRatingDTO._

case class CampaignQualityRatingDTO (
  /* Идентификатор магазина. */
  campaignId: Long,
/* Список значений индекса качества. */
  ratings: List[QualityRatingDTO])

object CampaignQualityRatingDTO {
  import DateTimeCodecs._

  implicit val CampaignQualityRatingDTOCodecJson: CodecJson[CampaignQualityRatingDTO] = CodecJson.derive[CampaignQualityRatingDTO]
  implicit val CampaignQualityRatingDTODecoder: EntityDecoder[CampaignQualityRatingDTO] = jsonOf[CampaignQualityRatingDTO]
  implicit val CampaignQualityRatingDTOEncoder: EntityEncoder[CampaignQualityRatingDTO] = jsonEncoderOf[CampaignQualityRatingDTO]
}
