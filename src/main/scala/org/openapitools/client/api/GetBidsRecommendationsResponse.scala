package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import GetBidsRecommendationsResponse._

case class GetBidsRecommendationsResponse (
  status: Option[ApiResponseStatusType],
result: Option[GetBidsRecommendationsResponseDTO])

object GetBidsRecommendationsResponse {
  import DateTimeCodecs._

  implicit val GetBidsRecommendationsResponseCodecJson: CodecJson[GetBidsRecommendationsResponse] = CodecJson.derive[GetBidsRecommendationsResponse]
  implicit val GetBidsRecommendationsResponseDecoder: EntityDecoder[GetBidsRecommendationsResponse] = jsonOf[GetBidsRecommendationsResponse]
  implicit val GetBidsRecommendationsResponseEncoder: EntityEncoder[GetBidsRecommendationsResponse] = jsonEncoderOf[GetBidsRecommendationsResponse]
}
