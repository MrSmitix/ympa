package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import DayOfWeekType._

case class DayOfWeekType (
  
object DayOfWeekType {
  import DateTimeCodecs._

  implicit val DayOfWeekTypeCodecJson: CodecJson[DayOfWeekType] = CodecJson.derive[DayOfWeekType]
  implicit val DayOfWeekTypeDecoder: EntityDecoder[DayOfWeekType] = jsonOf[DayOfWeekType]
  implicit val DayOfWeekTypeEncoder: EntityEncoder[DayOfWeekType] = jsonEncoderOf[DayOfWeekType]
}
