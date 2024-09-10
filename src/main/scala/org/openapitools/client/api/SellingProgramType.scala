package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import SellingProgramType._

case class SellingProgramType (
  
object SellingProgramType {
  import DateTimeCodecs._

  implicit val SellingProgramTypeCodecJson: CodecJson[SellingProgramType] = CodecJson.derive[SellingProgramType]
  implicit val SellingProgramTypeDecoder: EntityDecoder[SellingProgramType] = jsonOf[SellingProgramType]
  implicit val SellingProgramTypeEncoder: EntityEncoder[SellingProgramType] = jsonEncoderOf[SellingProgramType]
}
