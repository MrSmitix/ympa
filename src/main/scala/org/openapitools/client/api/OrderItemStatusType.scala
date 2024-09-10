package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import OrderItemStatusType._

case class OrderItemStatusType (
  
object OrderItemStatusType {
  import DateTimeCodecs._

  implicit val OrderItemStatusTypeCodecJson: CodecJson[OrderItemStatusType] = CodecJson.derive[OrderItemStatusType]
  implicit val OrderItemStatusTypeDecoder: EntityDecoder[OrderItemStatusType] = jsonOf[OrderItemStatusType]
  implicit val OrderItemStatusTypeEncoder: EntityEncoder[OrderItemStatusType] = jsonEncoderOf[OrderItemStatusType]
}
