package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import OrderUpdateStatusType._

case class OrderUpdateStatusType (
  
object OrderUpdateStatusType {
  import DateTimeCodecs._

  implicit val OrderUpdateStatusTypeCodecJson: CodecJson[OrderUpdateStatusType] = CodecJson.derive[OrderUpdateStatusType]
  implicit val OrderUpdateStatusTypeDecoder: EntityDecoder[OrderUpdateStatusType] = jsonOf[OrderUpdateStatusType]
  implicit val OrderUpdateStatusTypeEncoder: EntityEncoder[OrderUpdateStatusType] = jsonEncoderOf[OrderUpdateStatusType]
}
