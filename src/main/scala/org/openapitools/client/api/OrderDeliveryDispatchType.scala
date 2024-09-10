package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import OrderDeliveryDispatchType._

case class OrderDeliveryDispatchType (
  
object OrderDeliveryDispatchType {
  import DateTimeCodecs._

  implicit val OrderDeliveryDispatchTypeCodecJson: CodecJson[OrderDeliveryDispatchType] = CodecJson.derive[OrderDeliveryDispatchType]
  implicit val OrderDeliveryDispatchTypeDecoder: EntityDecoder[OrderDeliveryDispatchType] = jsonOf[OrderDeliveryDispatchType]
  implicit val OrderDeliveryDispatchTypeEncoder: EntityEncoder[OrderDeliveryDispatchType] = jsonEncoderOf[OrderDeliveryDispatchType]
}
