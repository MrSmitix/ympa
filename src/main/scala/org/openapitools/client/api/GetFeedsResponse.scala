package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import GetFeedsResponse._

case class GetFeedsResponse (
  /* Список прайс-листов. */
  feeds: List[FeedDTO])

object GetFeedsResponse {
  import DateTimeCodecs._

  implicit val GetFeedsResponseCodecJson: CodecJson[GetFeedsResponse] = CodecJson.derive[GetFeedsResponse]
  implicit val GetFeedsResponseDecoder: EntityDecoder[GetFeedsResponse] = jsonOf[GetFeedsResponse]
  implicit val GetFeedsResponseEncoder: EntityEncoder[GetFeedsResponse] = jsonEncoderOf[GetFeedsResponse]
}
