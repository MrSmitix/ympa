package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import OrderStatusType._

case class OrderStatusType (
  
object OrderStatusType {
  import DateTimeCodecs._

  implicit val OrderStatusTypeCodecJson: CodecJson[OrderStatusType] = CodecJson.derive[OrderStatusType]
  implicit val OrderStatusTypeDecoder: EntityDecoder[OrderStatusType] = jsonOf[OrderStatusType]
  implicit val OrderStatusTypeEncoder: EntityEncoder[OrderStatusType] = jsonEncoderOf[OrderStatusType]
}
