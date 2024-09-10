package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import OrdersStatsPriceType._

case class OrdersStatsPriceType (
  
object OrdersStatsPriceType {
  import DateTimeCodecs._

  implicit val OrdersStatsPriceTypeCodecJson: CodecJson[OrdersStatsPriceType] = CodecJson.derive[OrdersStatsPriceType]
  implicit val OrdersStatsPriceTypeDecoder: EntityDecoder[OrdersStatsPriceType] = jsonOf[OrdersStatsPriceType]
  implicit val OrdersStatsPriceTypeEncoder: EntityEncoder[OrdersStatsPriceType] = jsonEncoderOf[OrdersStatsPriceType]
}
