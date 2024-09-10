package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import OrderItemInstanceType._

case class OrderItemInstanceType (
  
object OrderItemInstanceType {
  import DateTimeCodecs._

  implicit val OrderItemInstanceTypeCodecJson: CodecJson[OrderItemInstanceType] = CodecJson.derive[OrderItemInstanceType]
  implicit val OrderItemInstanceTypeDecoder: EntityDecoder[OrderItemInstanceType] = jsonOf[OrderItemInstanceType]
  implicit val OrderItemInstanceTypeEncoder: EntityEncoder[OrderItemInstanceType] = jsonEncoderOf[OrderItemInstanceType]
}
