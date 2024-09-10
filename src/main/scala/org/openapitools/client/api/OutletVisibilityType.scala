package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import OutletVisibilityType._

case class OutletVisibilityType (
  
object OutletVisibilityType {
  import DateTimeCodecs._

  implicit val OutletVisibilityTypeCodecJson: CodecJson[OutletVisibilityType] = CodecJson.derive[OutletVisibilityType]
  implicit val OutletVisibilityTypeDecoder: EntityDecoder[OutletVisibilityType] = jsonOf[OutletVisibilityType]
  implicit val OutletVisibilityTypeEncoder: EntityEncoder[OutletVisibilityType] = jsonEncoderOf[OutletVisibilityType]
}
