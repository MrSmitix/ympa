package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import OrderSubsidyType._

case class OrderSubsidyType (
  
object OrderSubsidyType {
  import DateTimeCodecs._

  implicit val OrderSubsidyTypeCodecJson: CodecJson[OrderSubsidyType] = CodecJson.derive[OrderSubsidyType]
  implicit val OrderSubsidyTypeDecoder: EntityDecoder[OrderSubsidyType] = jsonOf[OrderSubsidyType]
  implicit val OrderSubsidyTypeEncoder: EntityEncoder[OrderSubsidyType] = jsonEncoderOf[OrderSubsidyType]
}
