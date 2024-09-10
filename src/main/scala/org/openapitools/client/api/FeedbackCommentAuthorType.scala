package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import FeedbackCommentAuthorType._

case class FeedbackCommentAuthorType (
  
object FeedbackCommentAuthorType {
  import DateTimeCodecs._

  implicit val FeedbackCommentAuthorTypeCodecJson: CodecJson[FeedbackCommentAuthorType] = CodecJson.derive[FeedbackCommentAuthorType]
  implicit val FeedbackCommentAuthorTypeDecoder: EntityDecoder[FeedbackCommentAuthorType] = jsonOf[FeedbackCommentAuthorType]
  implicit val FeedbackCommentAuthorTypeEncoder: EntityEncoder[FeedbackCommentAuthorType] = jsonEncoderOf[FeedbackCommentAuthorType]
}
