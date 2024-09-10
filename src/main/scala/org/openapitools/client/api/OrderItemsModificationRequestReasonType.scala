package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import OrderItemsModificationRequestReasonType._

case class OrderItemsModificationRequestReasonType (
  
object OrderItemsModificationRequestReasonType {
  import DateTimeCodecs._

  implicit val OrderItemsModificationRequestReasonTypeCodecJson: CodecJson[OrderItemsModificationRequestReasonType] = CodecJson.derive[OrderItemsModificationRequestReasonType]
  implicit val OrderItemsModificationRequestReasonTypeDecoder: EntityDecoder[OrderItemsModificationRequestReasonType] = jsonOf[OrderItemsModificationRequestReasonType]
  implicit val OrderItemsModificationRequestReasonTypeEncoder: EntityEncoder[OrderItemsModificationRequestReasonType] = jsonEncoderOf[OrderItemsModificationRequestReasonType]
}
