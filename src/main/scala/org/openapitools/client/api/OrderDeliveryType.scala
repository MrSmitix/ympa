package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import OrderDeliveryType._

case class OrderDeliveryType (
  
object OrderDeliveryType {
  import DateTimeCodecs._

  implicit val OrderDeliveryTypeCodecJson: CodecJson[OrderDeliveryType] = CodecJson.derive[OrderDeliveryType]
  implicit val OrderDeliveryTypeDecoder: EntityDecoder[OrderDeliveryType] = jsonOf[OrderDeliveryType]
  implicit val OrderDeliveryTypeEncoder: EntityEncoder[OrderDeliveryType] = jsonEncoderOf[OrderDeliveryType]
}
