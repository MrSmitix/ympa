package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import GenerateReportResponse._

case class GenerateReportResponse (
  status: Option[ApiResponseStatusType],
result: Option[GenerateReportDTO])

object GenerateReportResponse {
  import DateTimeCodecs._

  implicit val GenerateReportResponseCodecJson: CodecJson[GenerateReportResponse] = CodecJson.derive[GenerateReportResponse]
  implicit val GenerateReportResponseDecoder: EntityDecoder[GenerateReportResponse] = jsonOf[GenerateReportResponse]
  implicit val GenerateReportResponseEncoder: EntityEncoder[GenerateReportResponse] = jsonEncoderOf[GenerateReportResponse]
}
