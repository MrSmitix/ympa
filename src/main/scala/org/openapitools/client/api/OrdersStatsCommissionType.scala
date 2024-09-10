package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import OrdersStatsCommissionType._

case class OrdersStatsCommissionType (
  
object OrdersStatsCommissionType {
  import DateTimeCodecs._

  implicit val OrdersStatsCommissionTypeCodecJson: CodecJson[OrdersStatsCommissionType] = CodecJson.derive[OrdersStatsCommissionType]
  implicit val OrdersStatsCommissionTypeDecoder: EntityDecoder[OrdersStatsCommissionType] = jsonOf[OrdersStatsCommissionType]
  implicit val OrdersStatsCommissionTypeEncoder: EntityEncoder[OrdersStatsCommissionType] = jsonEncoderOf[OrdersStatsCommissionType]
}
