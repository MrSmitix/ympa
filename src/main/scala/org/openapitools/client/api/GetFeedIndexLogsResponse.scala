package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import GetFeedIndexLogsResponse._

case class GetFeedIndexLogsResponse (
  status: Option[ApiResponseStatusType],
result: Option[FeedIndexLogsResultDTO])

object GetFeedIndexLogsResponse {
  import DateTimeCodecs._

  implicit val GetFeedIndexLogsResponseCodecJson: CodecJson[GetFeedIndexLogsResponse] = CodecJson.derive[GetFeedIndexLogsResponse]
  implicit val GetFeedIndexLogsResponseDecoder: EntityDecoder[GetFeedIndexLogsResponse] = jsonOf[GetFeedIndexLogsResponse]
  implicit val GetFeedIndexLogsResponseEncoder: EntityEncoder[GetFeedIndexLogsResponse] = jsonEncoderOf[GetFeedIndexLogsResponse]
}
