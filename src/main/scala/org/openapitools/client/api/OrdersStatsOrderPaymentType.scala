package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import OrdersStatsOrderPaymentType._

case class OrdersStatsOrderPaymentType (
  
object OrdersStatsOrderPaymentType {
  import DateTimeCodecs._

  implicit val OrdersStatsOrderPaymentTypeCodecJson: CodecJson[OrdersStatsOrderPaymentType] = CodecJson.derive[OrdersStatsOrderPaymentType]
  implicit val OrdersStatsOrderPaymentTypeDecoder: EntityDecoder[OrdersStatsOrderPaymentType] = jsonOf[OrdersStatsOrderPaymentType]
  implicit val OrdersStatsOrderPaymentTypeEncoder: EntityEncoder[OrdersStatsOrderPaymentType] = jsonEncoderOf[OrdersStatsOrderPaymentType]
}
