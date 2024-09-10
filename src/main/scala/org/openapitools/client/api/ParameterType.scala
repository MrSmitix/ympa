package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ParameterType._

case class ParameterType (
  
object ParameterType {
  import DateTimeCodecs._

  implicit val ParameterTypeCodecJson: CodecJson[ParameterType] = CodecJson.derive[ParameterType]
  implicit val ParameterTypeDecoder: EntityDecoder[ParameterType] = jsonOf[ParameterType]
  implicit val ParameterTypeEncoder: EntityEncoder[ParameterType] = jsonEncoderOf[ParameterType]
}
