package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import RegionType._

case class RegionType (
  
object RegionType {
  import DateTimeCodecs._

  implicit val RegionTypeCodecJson: CodecJson[RegionType] = CodecJson.derive[RegionType]
  implicit val RegionTypeDecoder: EntityDecoder[RegionType] = jsonOf[RegionType]
  implicit val RegionTypeEncoder: EntityEncoder[RegionType] = jsonEncoderOf[RegionType]
}
