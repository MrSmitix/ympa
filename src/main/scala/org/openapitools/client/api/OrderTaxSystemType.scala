package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import OrderTaxSystemType._

case class OrderTaxSystemType (
  
object OrderTaxSystemType {
  import DateTimeCodecs._

  implicit val OrderTaxSystemTypeCodecJson: CodecJson[OrderTaxSystemType] = CodecJson.derive[OrderTaxSystemType]
  implicit val OrderTaxSystemTypeDecoder: EntityDecoder[OrderTaxSystemType] = jsonOf[OrderTaxSystemType]
  implicit val OrderTaxSystemTypeEncoder: EntityEncoder[OrderTaxSystemType] = jsonEncoderOf[OrderTaxSystemType]
}
