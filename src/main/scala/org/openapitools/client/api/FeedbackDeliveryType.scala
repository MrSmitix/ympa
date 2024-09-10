package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import FeedbackDeliveryType._

case class FeedbackDeliveryType (
  
object FeedbackDeliveryType {
  import DateTimeCodecs._

  implicit val FeedbackDeliveryTypeCodecJson: CodecJson[FeedbackDeliveryType] = CodecJson.derive[FeedbackDeliveryType]
  implicit val FeedbackDeliveryTypeDecoder: EntityDecoder[FeedbackDeliveryType] = jsonOf[FeedbackDeliveryType]
  implicit val FeedbackDeliveryTypeEncoder: EntityEncoder[FeedbackDeliveryType] = jsonEncoderOf[FeedbackDeliveryType]
}
