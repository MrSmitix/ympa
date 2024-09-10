package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import OrdersStatsPaymentSourceType._

case class OrdersStatsPaymentSourceType (
  
object OrdersStatsPaymentSourceType {
  import DateTimeCodecs._

  implicit val OrdersStatsPaymentSourceTypeCodecJson: CodecJson[OrdersStatsPaymentSourceType] = CodecJson.derive[OrdersStatsPaymentSourceType]
  implicit val OrdersStatsPaymentSourceTypeDecoder: EntityDecoder[OrdersStatsPaymentSourceType] = jsonOf[OrdersStatsPaymentSourceType]
  implicit val OrdersStatsPaymentSourceTypeEncoder: EntityEncoder[OrdersStatsPaymentSourceType] = jsonEncoderOf[OrdersStatsPaymentSourceType]
}
