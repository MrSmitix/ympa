package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import TimeUnitType._

case class TimeUnitType (
  
object TimeUnitType {
  import DateTimeCodecs._

  implicit val TimeUnitTypeCodecJson: CodecJson[TimeUnitType] = CodecJson.derive[TimeUnitType]
  implicit val TimeUnitTypeDecoder: EntityDecoder[TimeUnitType] = jsonOf[TimeUnitType]
  implicit val TimeUnitTypeEncoder: EntityEncoder[TimeUnitType] = jsonEncoderOf[TimeUnitType]
}
