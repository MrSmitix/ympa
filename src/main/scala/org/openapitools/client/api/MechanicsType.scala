package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import MechanicsType._

case class MechanicsType (
  
object MechanicsType {
  import DateTimeCodecs._

  implicit val MechanicsTypeCodecJson: CodecJson[MechanicsType] = CodecJson.derive[MechanicsType]
  implicit val MechanicsTypeDecoder: EntityDecoder[MechanicsType] = jsonOf[MechanicsType]
  implicit val MechanicsTypeEncoder: EntityEncoder[MechanicsType] = jsonEncoderOf[MechanicsType]
}
