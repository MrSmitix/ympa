package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import OrderItemSubsidyType._

case class OrderItemSubsidyType (
  
object OrderItemSubsidyType {
  import DateTimeCodecs._

  implicit val OrderItemSubsidyTypeCodecJson: CodecJson[OrderItemSubsidyType] = CodecJson.derive[OrderItemSubsidyType]
  implicit val OrderItemSubsidyTypeDecoder: EntityDecoder[OrderItemSubsidyType] = jsonOf[OrderItemSubsidyType]
  implicit val OrderItemSubsidyTypeEncoder: EntityEncoder[OrderItemSubsidyType] = jsonEncoderOf[OrderItemSubsidyType]
}
