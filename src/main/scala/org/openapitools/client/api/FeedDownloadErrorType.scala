package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import FeedDownloadErrorType._

case class FeedDownloadErrorType (
  
object FeedDownloadErrorType {
  import DateTimeCodecs._

  implicit val FeedDownloadErrorTypeCodecJson: CodecJson[FeedDownloadErrorType] = CodecJson.derive[FeedDownloadErrorType]
  implicit val FeedDownloadErrorTypeDecoder: EntityDecoder[FeedDownloadErrorType] = jsonOf[FeedDownloadErrorType]
  implicit val FeedDownloadErrorTypeEncoder: EntityEncoder[FeedDownloadErrorType] = jsonEncoderOf[FeedDownloadErrorType]
}
