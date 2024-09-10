package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import GetQualityRatingDetailsResponse._

case class GetQualityRatingDetailsResponse (
  status: Option[ApiResponseStatusType],
result: Option[QualityRatingDetailsDTO])

object GetQualityRatingDetailsResponse {
  import DateTimeCodecs._

  implicit val GetQualityRatingDetailsResponseCodecJson: CodecJson[GetQualityRatingDetailsResponse] = CodecJson.derive[GetQualityRatingDetailsResponse]
  implicit val GetQualityRatingDetailsResponseDecoder: EntityDecoder[GetQualityRatingDetailsResponse] = jsonOf[GetQualityRatingDetailsResponse]
  implicit val GetQualityRatingDetailsResponseEncoder: EntityEncoder[GetQualityRatingDetailsResponse] = jsonEncoderOf[GetQualityRatingDetailsResponse]
}
