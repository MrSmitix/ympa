package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import GetBidsRecommendationsResponseDTO._

case class GetBidsRecommendationsResponseDTO (
  /* Список товаров с рекомендованными ставками. */
  recommendations: List[SkuBidRecommendationItemDTO])

object GetBidsRecommendationsResponseDTO {
  import DateTimeCodecs._

  implicit val GetBidsRecommendationsResponseDTOCodecJson: CodecJson[GetBidsRecommendationsResponseDTO] = CodecJson.derive[GetBidsRecommendationsResponseDTO]
  implicit val GetBidsRecommendationsResponseDTODecoder: EntityDecoder[GetBidsRecommendationsResponseDTO] = jsonOf[GetBidsRecommendationsResponseDTO]
  implicit val GetBidsRecommendationsResponseDTOEncoder: EntityEncoder[GetBidsRecommendationsResponseDTO] = jsonEncoderOf[GetBidsRecommendationsResponseDTO]
}
