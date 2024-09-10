package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import OrdersStatsPaymentType._

case class OrdersStatsPaymentType (
  
object OrdersStatsPaymentType {
  import DateTimeCodecs._

  implicit val OrdersStatsPaymentTypeCodecJson: CodecJson[OrdersStatsPaymentType] = CodecJson.derive[OrdersStatsPaymentType]
  implicit val OrdersStatsPaymentTypeDecoder: EntityDecoder[OrdersStatsPaymentType] = jsonOf[OrdersStatsPaymentType]
  implicit val OrdersStatsPaymentTypeEncoder: EntityEncoder[OrdersStatsPaymentType] = jsonEncoderOf[OrdersStatsPaymentType]
}
