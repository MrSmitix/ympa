package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import OfferRecommendationDTO._

case class OfferRecommendationDTO (
  offer: Option[OfferForRecommendationDTO],
recommendation: Option[OfferRecommendationInfoDTO])

object OfferRecommendationDTO {
  import DateTimeCodecs._

  implicit val OfferRecommendationDTOCodecJson: CodecJson[OfferRecommendationDTO] = CodecJson.derive[OfferRecommendationDTO]
  implicit val OfferRecommendationDTODecoder: EntityDecoder[OfferRecommendationDTO] = jsonOf[OfferRecommendationDTO]
  implicit val OfferRecommendationDTOEncoder: EntityEncoder[OfferRecommendationDTO] = jsonEncoderOf[OfferRecommendationDTO]
}
