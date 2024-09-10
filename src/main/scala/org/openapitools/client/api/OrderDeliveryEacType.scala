package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import OrderDeliveryEacType._

case class OrderDeliveryEacType (
  
object OrderDeliveryEacType {
  import DateTimeCodecs._

  implicit val OrderDeliveryEacTypeCodecJson: CodecJson[OrderDeliveryEacType] = CodecJson.derive[OrderDeliveryEacType]
  implicit val OrderDeliveryEacTypeDecoder: EntityDecoder[OrderDeliveryEacType] = jsonOf[OrderDeliveryEacType]
  implicit val OrderDeliveryEacTypeEncoder: EntityEncoder[OrderDeliveryEacType] = jsonEncoderOf[OrderDeliveryEacType]
}
