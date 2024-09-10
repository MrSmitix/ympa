package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import OutletType._

case class OutletType (
  
object OutletType {
  import DateTimeCodecs._

  implicit val OutletTypeCodecJson: CodecJson[OutletType] = CodecJson.derive[OutletType]
  implicit val OutletTypeDecoder: EntityDecoder[OutletType] = jsonOf[OutletType]
  implicit val OutletTypeEncoder: EntityEncoder[OutletType] = jsonEncoderOf[OutletType]
}
