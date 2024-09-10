package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import GoodsFeedbackCommentStatusType._

case class GoodsFeedbackCommentStatusType (
  
object GoodsFeedbackCommentStatusType {
  import DateTimeCodecs._

  implicit val GoodsFeedbackCommentStatusTypeCodecJson: CodecJson[GoodsFeedbackCommentStatusType] = CodecJson.derive[GoodsFeedbackCommentStatusType]
  implicit val GoodsFeedbackCommentStatusTypeDecoder: EntityDecoder[GoodsFeedbackCommentStatusType] = jsonOf[GoodsFeedbackCommentStatusType]
  implicit val GoodsFeedbackCommentStatusTypeEncoder: EntityEncoder[GoodsFeedbackCommentStatusType] = jsonEncoderOf[GoodsFeedbackCommentStatusType]
}
