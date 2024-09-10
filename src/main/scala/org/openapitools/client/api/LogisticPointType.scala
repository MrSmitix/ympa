package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import LogisticPointType._

case class LogisticPointType (
  
object LogisticPointType {
  import DateTimeCodecs._

  implicit val LogisticPointTypeCodecJson: CodecJson[LogisticPointType] = CodecJson.derive[LogisticPointType]
  implicit val LogisticPointTypeDecoder: EntityDecoder[LogisticPointType] = jsonOf[LogisticPointType]
  implicit val LogisticPointTypeEncoder: EntityEncoder[LogisticPointType] = jsonEncoderOf[LogisticPointType]
}
