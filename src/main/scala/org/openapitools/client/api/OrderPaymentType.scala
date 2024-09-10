package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import OrderPaymentType._

case class OrderPaymentType (
  
object OrderPaymentType {
  import DateTimeCodecs._

  implicit val OrderPaymentTypeCodecJson: CodecJson[OrderPaymentType] = CodecJson.derive[OrderPaymentType]
  implicit val OrderPaymentTypeDecoder: EntityDecoder[OrderPaymentType] = jsonOf[OrderPaymentType]
  implicit val OrderPaymentTypeEncoder: EntityEncoder[OrderPaymentType] = jsonEncoderOf[OrderPaymentType]
}
