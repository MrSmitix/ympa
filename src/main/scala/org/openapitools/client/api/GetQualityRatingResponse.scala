package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import GetQualityRatingResponse._

case class GetQualityRatingResponse (
  status: Option[ApiResponseStatusType],
result: Option[CampaignsQualityRatingDTO])

object GetQualityRatingResponse {
  import DateTimeCodecs._

  implicit val GetQualityRatingResponseCodecJson: CodecJson[GetQualityRatingResponse] = CodecJson.derive[GetQualityRatingResponse]
  implicit val GetQualityRatingResponseDecoder: EntityDecoder[GetQualityRatingResponse] = jsonOf[GetQualityRatingResponse]
  implicit val GetQualityRatingResponseEncoder: EntityEncoder[GetQualityRatingResponse] = jsonEncoderOf[GetQualityRatingResponse]
}
