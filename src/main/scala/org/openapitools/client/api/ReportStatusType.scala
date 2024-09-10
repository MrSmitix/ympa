package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ReportStatusType._

case class ReportStatusType (
  
object ReportStatusType {
  import DateTimeCodecs._

  implicit val ReportStatusTypeCodecJson: CodecJson[ReportStatusType] = CodecJson.derive[ReportStatusType]
  implicit val ReportStatusTypeDecoder: EntityDecoder[ReportStatusType] = jsonOf[ReportStatusType]
  implicit val ReportStatusTypeEncoder: EntityEncoder[ReportStatusType] = jsonEncoderOf[ReportStatusType]
}
