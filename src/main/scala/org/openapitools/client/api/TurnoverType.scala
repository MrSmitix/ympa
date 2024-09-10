package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import TurnoverType._

case class TurnoverType (
  
object TurnoverType {
  import DateTimeCodecs._

  implicit val TurnoverTypeCodecJson: CodecJson[TurnoverType] = CodecJson.derive[TurnoverType]
  implicit val TurnoverTypeDecoder: EntityDecoder[TurnoverType] = jsonOf[TurnoverType]
  implicit val TurnoverTypeEncoder: EntityEncoder[TurnoverType] = jsonEncoderOf[TurnoverType]
}
