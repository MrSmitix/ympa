package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import OrdersStatsItemStatusType._

case class OrdersStatsItemStatusType (
  
object OrdersStatsItemStatusType {
  import DateTimeCodecs._

  implicit val OrdersStatsItemStatusTypeCodecJson: CodecJson[OrdersStatsItemStatusType] = CodecJson.derive[OrdersStatsItemStatusType]
  implicit val OrdersStatsItemStatusTypeDecoder: EntityDecoder[OrdersStatsItemStatusType] = jsonOf[OrdersStatsItemStatusType]
  implicit val OrdersStatsItemStatusTypeEncoder: EntityEncoder[OrdersStatsItemStatusType] = jsonEncoderOf[OrdersStatsItemStatusType]
}
