package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import OrderSubstatusType._

case class OrderSubstatusType (
  
object OrderSubstatusType {
  import DateTimeCodecs._

  implicit val OrderSubstatusTypeCodecJson: CodecJson[OrderSubstatusType] = CodecJson.derive[OrderSubstatusType]
  implicit val OrderSubstatusTypeDecoder: EntityDecoder[OrderSubstatusType] = jsonOf[OrderSubstatusType]
  implicit val OrderSubstatusTypeEncoder: EntityEncoder[OrderSubstatusType] = jsonEncoderOf[OrderSubstatusType]
}
