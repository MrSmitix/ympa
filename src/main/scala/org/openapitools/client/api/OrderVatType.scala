package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import OrderVatType._

case class OrderVatType (
  
object OrderVatType {
  import DateTimeCodecs._

  implicit val OrderVatTypeCodecJson: CodecJson[OrderVatType] = CodecJson.derive[OrderVatType]
  implicit val OrderVatTypeDecoder: EntityDecoder[OrderVatType] = jsonOf[OrderVatType]
  implicit val OrderVatTypeEncoder: EntityEncoder[OrderVatType] = jsonEncoderOf[OrderVatType]
}
