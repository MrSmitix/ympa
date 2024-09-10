package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import OrderBuyerType._

case class OrderBuyerType (
  
object OrderBuyerType {
  import DateTimeCodecs._

  implicit val OrderBuyerTypeCodecJson: CodecJson[OrderBuyerType] = CodecJson.derive[OrderBuyerType]
  implicit val OrderBuyerTypeDecoder: EntityDecoder[OrderBuyerType] = jsonOf[OrderBuyerType]
  implicit val OrderBuyerTypeEncoder: EntityEncoder[OrderBuyerType] = jsonEncoderOf[OrderBuyerType]
}
