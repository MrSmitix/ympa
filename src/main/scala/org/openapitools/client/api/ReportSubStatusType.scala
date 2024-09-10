package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ReportSubStatusType._

case class ReportSubStatusType (
  
object ReportSubStatusType {
  import DateTimeCodecs._

  implicit val ReportSubStatusTypeCodecJson: CodecJson[ReportSubStatusType] = CodecJson.derive[ReportSubStatusType]
  implicit val ReportSubStatusTypeDecoder: EntityDecoder[ReportSubStatusType] = jsonOf[ReportSubStatusType]
  implicit val ReportSubStatusTypeEncoder: EntityEncoder[ReportSubStatusType] = jsonEncoderOf[ReportSubStatusType]
}
