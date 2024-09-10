package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PageFormatType._

case class PageFormatType (
  
object PageFormatType {
  import DateTimeCodecs._

  implicit val PageFormatTypeCodecJson: CodecJson[PageFormatType] = CodecJson.derive[PageFormatType]
  implicit val PageFormatTypeDecoder: EntityDecoder[PageFormatType] = jsonOf[PageFormatType]
  implicit val PageFormatTypeEncoder: EntityEncoder[PageFormatType] = jsonEncoderOf[PageFormatType]
}
