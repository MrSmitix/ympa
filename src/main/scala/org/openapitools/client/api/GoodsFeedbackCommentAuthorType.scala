package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import GoodsFeedbackCommentAuthorType._

case class GoodsFeedbackCommentAuthorType (
  
object GoodsFeedbackCommentAuthorType {
  import DateTimeCodecs._

  implicit val GoodsFeedbackCommentAuthorTypeCodecJson: CodecJson[GoodsFeedbackCommentAuthorType] = CodecJson.derive[GoodsFeedbackCommentAuthorType]
  implicit val GoodsFeedbackCommentAuthorTypeDecoder: EntityDecoder[GoodsFeedbackCommentAuthorType] = jsonOf[GoodsFeedbackCommentAuthorType]
  implicit val GoodsFeedbackCommentAuthorTypeEncoder: EntityEncoder[GoodsFeedbackCommentAuthorType] = jsonEncoderOf[GoodsFeedbackCommentAuthorType]
}
