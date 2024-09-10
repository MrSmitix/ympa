package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import GetOfferRecommendationsResponse._

case class GetOfferRecommendationsResponse (
  status: Option[ApiResponseStatusType],
result: Option[OfferRecommendationsResultDTO])

object GetOfferRecommendationsResponse {
  import DateTimeCodecs._

  implicit val GetOfferRecommendationsResponseCodecJson: CodecJson[GetOfferRecommendationsResponse] = CodecJson.derive[GetOfferRecommendationsResponse]
  implicit val GetOfferRecommendationsResponseDecoder: EntityDecoder[GetOfferRecommendationsResponse] = jsonOf[GetOfferRecommendationsResponse]
  implicit val GetOfferRecommendationsResponseEncoder: EntityEncoder[GetOfferRecommendationsResponse] = jsonEncoderOf[GetOfferRecommendationsResponse]
}
