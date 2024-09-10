package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AgeUnitType._

case class AgeUnitType (
  
object AgeUnitType {
  import DateTimeCodecs._

  implicit val AgeUnitTypeCodecJson: CodecJson[AgeUnitType] = CodecJson.derive[AgeUnitType]
  implicit val AgeUnitTypeDecoder: EntityDecoder[AgeUnitType] = jsonOf[AgeUnitType]
  implicit val AgeUnitTypeEncoder: EntityEncoder[AgeUnitType] = jsonEncoderOf[AgeUnitType]
}
