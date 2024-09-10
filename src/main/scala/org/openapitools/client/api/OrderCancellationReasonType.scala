package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import OrderCancellationReasonType._

case class OrderCancellationReasonType (
  
object OrderCancellationReasonType {
  import DateTimeCodecs._

  implicit val OrderCancellationReasonTypeCodecJson: CodecJson[OrderCancellationReasonType] = CodecJson.derive[OrderCancellationReasonType]
  implicit val OrderCancellationReasonTypeDecoder: EntityDecoder[OrderCancellationReasonType] = jsonOf[OrderCancellationReasonType]
  implicit val OrderCancellationReasonTypeEncoder: EntityEncoder[OrderCancellationReasonType] = jsonEncoderOf[OrderCancellationReasonType]
}
