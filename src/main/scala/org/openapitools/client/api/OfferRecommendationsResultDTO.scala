package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import OfferRecommendationsResultDTO._

case class OfferRecommendationsResultDTO (
  paging: Option[ScrollingPagerDTO],
/* Страница списка товаров. */
  offerRecommendations: List[OfferRecommendationDTO])

object OfferRecommendationsResultDTO {
  import DateTimeCodecs._

  implicit val OfferRecommendationsResultDTOCodecJson: CodecJson[OfferRecommendationsResultDTO] = CodecJson.derive[OfferRecommendationsResultDTO]
  implicit val OfferRecommendationsResultDTODecoder: EntityDecoder[OfferRecommendationsResultDTO] = jsonOf[OfferRecommendationsResultDTO]
  implicit val OfferRecommendationsResultDTOEncoder: EntityEncoder[OfferRecommendationsResultDTO] = jsonEncoderOf[OfferRecommendationsResultDTO]
}
