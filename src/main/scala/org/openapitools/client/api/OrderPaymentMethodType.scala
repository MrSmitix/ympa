package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import OrderPaymentMethodType._

case class OrderPaymentMethodType (
  
object OrderPaymentMethodType {
  import DateTimeCodecs._

  implicit val OrderPaymentMethodTypeCodecJson: CodecJson[OrderPaymentMethodType] = CodecJson.derive[OrderPaymentMethodType]
  implicit val OrderPaymentMethodTypeDecoder: EntityDecoder[OrderPaymentMethodType] = jsonOf[OrderPaymentMethodType]
  implicit val OrderPaymentMethodTypeEncoder: EntityEncoder[OrderPaymentMethodType] = jsonEncoderOf[OrderPaymentMethodType]
}
