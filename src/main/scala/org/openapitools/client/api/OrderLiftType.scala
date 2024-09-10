package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import OrderLiftType._

case class OrderLiftType (
  
object OrderLiftType {
  import DateTimeCodecs._

  implicit val OrderLiftTypeCodecJson: CodecJson[OrderLiftType] = CodecJson.derive[OrderLiftType]
  implicit val OrderLiftTypeDecoder: EntityDecoder[OrderLiftType] = jsonOf[OrderLiftType]
  implicit val OrderLiftTypeEncoder: EntityEncoder[OrderLiftType] = jsonEncoderOf[OrderLiftType]
}
