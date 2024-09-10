package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import FeedIndexLogsErrorType._

case class FeedIndexLogsErrorType (
  
object FeedIndexLogsErrorType {
  import DateTimeCodecs._

  implicit val FeedIndexLogsErrorTypeCodecJson: CodecJson[FeedIndexLogsErrorType] = CodecJson.derive[FeedIndexLogsErrorType]
  implicit val FeedIndexLogsErrorTypeDecoder: EntityDecoder[FeedIndexLogsErrorType] = jsonOf[FeedIndexLogsErrorType]
  implicit val FeedIndexLogsErrorTypeEncoder: EntityEncoder[FeedIndexLogsErrorType] = jsonEncoderOf[FeedIndexLogsErrorType]
}
