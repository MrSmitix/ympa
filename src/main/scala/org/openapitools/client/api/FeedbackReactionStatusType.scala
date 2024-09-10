package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import FeedbackReactionStatusType._

case class FeedbackReactionStatusType (
  
object FeedbackReactionStatusType {
  import DateTimeCodecs._

  implicit val FeedbackReactionStatusTypeCodecJson: CodecJson[FeedbackReactionStatusType] = CodecJson.derive[FeedbackReactionStatusType]
  implicit val FeedbackReactionStatusTypeDecoder: EntityDecoder[FeedbackReactionStatusType] = jsonOf[FeedbackReactionStatusType]
  implicit val FeedbackReactionStatusTypeEncoder: EntityEncoder[FeedbackReactionStatusType] = jsonEncoderOf[FeedbackReactionStatusType]
}
