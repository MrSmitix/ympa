package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import OrderStatsStatusType._

case class OrderStatsStatusType (
  
object OrderStatsStatusType {
  import DateTimeCodecs._

  implicit val OrderStatsStatusTypeCodecJson: CodecJson[OrderStatsStatusType] = CodecJson.derive[OrderStatsStatusType]
  implicit val OrderStatsStatusTypeDecoder: EntityDecoder[OrderStatsStatusType] = jsonOf[OrderStatsStatusType]
  implicit val OrderStatsStatusTypeEncoder: EntityEncoder[OrderStatsStatusType] = jsonEncoderOf[OrderStatsStatusType]
}
