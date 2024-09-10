package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ReportFormatType._

case class ReportFormatType (
  
object ReportFormatType {
  import DateTimeCodecs._

  implicit val ReportFormatTypeCodecJson: CodecJson[ReportFormatType] = CodecJson.derive[ReportFormatType]
  implicit val ReportFormatTypeDecoder: EntityDecoder[ReportFormatType] = jsonOf[ReportFormatType]
  implicit val ReportFormatTypeEncoder: EntityEncoder[ReportFormatType] = jsonEncoderOf[ReportFormatType]
}
